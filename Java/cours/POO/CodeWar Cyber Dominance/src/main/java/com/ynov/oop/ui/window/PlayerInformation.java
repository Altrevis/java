package com.ynov.oop.ui.window;

import com.ynov.oop.Game;
import com.ynov.oop.ui.component.EncryptionKeyComponent;
import com.ynov.oop.ui.component.ProcessingPowerComponent;
import com.ynov.oop.ui.component.ServerComponent;
import jexer.TApplication;
import jexer.TLabel;
import jexer.TWidget;
import jexer.TWindow;

import java.util.ArrayList;

public class PlayerInformation extends TWindow implements Updatable {

    private ArrayList<TWidget> resourcesLabel;
    private ArrayList<TWidget> serverList;
    private final Game game;
    public PlayerInformation(TApplication application, Game game) {
        super(application, game.getCurrentPlayerName(), 50, 20);
        this.setCloseBox(false);
        this.setZoomBox(false);
        this.setResizable(false);
        this.game = game;
        setX(1);
        setY(1);
        resourcesLabel = drawResource();
        addSplitPane(0,3,50,1,false);
        addLabel("Server List", (this.getWidth()-2-11)/2, 4);
        addSplitPane(0,5,50,1,false);
        serverList = drawServerList();
        if(!serverList.isEmpty()) {
            setHeight(serverList.getLast().getY()+4);
        }
    }

    private ArrayList<TWidget> drawResource() {
        ArrayList<TWidget> w = new ArrayList<>();
        TLabel pp = new ProcessingPowerComponent(this, 0, 1, game.getCurrentPlayerProcessingPower());
        w.add(pp);
        w.add(new EncryptionKeyComponent(this,pp.getLabel().length() + 3,1, game.getCurrentPlayerEncryptionKey()));
        return w;
    }

    private ArrayList<TWidget> drawServerList() {
        ArrayList<TWidget> w = new ArrayList<>();
        int serverLine = 6;
        int serverColumn = 0;
        for(String ipAddress: game.getCurrentPlayerKnownServers()) {
            w.add(new ServerComponent(this, serverColumn*18, serverLine, ipAddress, game));
            serverColumn = (serverColumn+1)%2;
            if(serverColumn == 0) {
                serverLine += 2;
            }
        }
        return w;
    }

    @Override
    public void update() {
        for(TWidget w: resourcesLabel) {
            remove(w);
        }
        resourcesLabel = drawResource();

        for(TWidget w: serverList) {
            remove(w);
        }
        serverList = drawServerList();
        setHeight(serverList.getLast().getY()+4);
    }
}
