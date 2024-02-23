package com.ynov.oop.ui.window;

import com.ynov.oop.Game;
import com.ynov.oop.ui.component.ActionComponent;
import com.ynov.oop.ui.component.ServerComponent;
import jexer.TApplication;
import jexer.TLabel;
import jexer.TWidget;
import jexer.TWindow;

import java.util.ArrayList;

public class ServerWindow extends TWindow implements Updatable {
    private final String ipAddress;
    private final Game game;
    private TLabel encryptionLabel;
    private TLabel ownerLabel;
    private ArrayList<TWidget> serverList;
    private ArrayList<TWidget> actionsList;

    public ServerWindow(TApplication application, String ipAddress, Game game) {
        super(application, ipAddress, 27, 24);
        this.setResizable(false);
        this.setZoomBox(false);
        this.ipAddress = ipAddress;
        this.game = game;
        addComponent();
    }

    private TLabel drawEncryption() {
        if(game.serverBelongsToCurrentPlayer(ipAddress) || game.currentPlayerHasAnalysedServer(ipAddress)) {
            return addLabel("Is encrypted: " + game.serverIsEncrypted(ipAddress), 1, 2);
        } else {
            return addLabel("Is encrypted: ?", 1, 2);
        }
    }

    private TLabel drawOwner() {
        if(game.serverBelongsToCurrentPlayer(ipAddress) || game.currentPlayerHasAnalysedServer(ipAddress)) {
            return addLabel("Owner: " + game.getServerOwnerName(ipAddress), 1, 4);
        } else {
            return addLabel("Owner: ?", 1, 4);
        }
    }

    private ArrayList<TWidget> drawServerList() {
        int y = 9;
        ArrayList<TWidget> widgets = new ArrayList<>();
        for(String s: game.getKnownServer(ipAddress)) {
            if(game.currentPlayerKnowServer(s)) {
                y ++;
                widgets.add(new ServerComponent(this, 0, y ++, s, game));
            } else {
                widgets.add(addLabel("???", 1, ++y));
            }
        }
        if(widgets.isEmpty()) {
            widgets.add(addLabel("No server connected", 1, y));
        }
        return widgets;
    }

    private ArrayList<TWidget> drawAction(int y) {
        ArrayList<TWidget> w = new ArrayList<>();
        w.add(addSplitPane(0,++y,50,1,false));
        w.add(addLabel("Action", (this.getWidth()-2-6)/2, ++y));
        w.add(addSplitPane(0,++y,50,1,false));

        if(game.serverBelongsToCurrentPlayer(ipAddress)) {
            w.add(new ActionComponent(this,"encrypt", 0, y +=2, ipAddress, game));
        } else {
            w.add(new ActionComponent(this, "decrypt", 0, y +=2, ipAddress, game));
            w.add(new ActionComponent(this, "serverDominance", 0, y +=2, ipAddress, game));
        }
        w.add(new ActionComponent(this, "networkTrafficAnalysis", 0, y +2, ipAddress, game));
        return w;
    }


    private void addComponent() {
        addLabel(game.getServerType(ipAddress), 1, 1);

        encryptionLabel = drawEncryption();
        ownerLabel = drawOwner();

        addSplitPane(0, 6,50,1,false);
        addLabel("Connected to", (this.getWidth()-2-12)/2, 7);
        addSplitPane(0, 8,50,1,false);

        serverList = drawServerList();

        actionsList = drawAction(serverList.getLast().getY() + 1);

        this.setHeight(actionsList.getLast().getY() + 4);
    }

    @Override
    public void update() {

        remove(encryptionLabel);
        encryptionLabel = drawEncryption();

        remove(ownerLabel);
        ownerLabel = drawOwner();

        for(TWidget w: serverList) {
            remove(w);
        }
        serverList = drawServerList();

        for(TWidget w: actionsList) {
            remove(w);
        }

        actionsList = drawAction(serverList.getLast().getY() + 1);

        this.setHeight(actionsList.getLast().getY() + 4);
    }


    private String getServerIpAddress() {
        return ipAddress;
    }

    public static ServerWindow find(TApplication application, String ipAddress) {
        for (TWindow w : application.getAllWindows()) {
            if (w instanceof ServerWindow sw) {
                if (sw.getServerIpAddress().equals(ipAddress)) {
                    return sw;
                }
            }
        }
        return null;
    }
}
