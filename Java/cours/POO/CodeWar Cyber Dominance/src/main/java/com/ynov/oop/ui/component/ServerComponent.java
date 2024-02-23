package com.ynov.oop.ui.component;

import com.ynov.oop.Game;
import com.ynov.oop.ui.window.ServerWindow;
import jexer.TAction;
import jexer.TApplication;
import jexer.TButton;
import jexer.TWindow;

public class ServerComponent extends TButton {

    public ServerComponent(TWindow window, int x, int y, String ipAddress, Game game) {
        super(window, String.format("%s", ipAddress), x, y, new TAction() {
            @Override
            public void DO() {
                TApplication application = window.getApplication();

                ServerWindow sw = ServerWindow.find(application, ipAddress);
                if(sw != null) {
                    sw.activate();
                } else {
                    new ServerWindow(window.getApplication(), ipAddress, game);
                }

            }
        });
        setShadowColor(null);
        setActive(false);
    }

}
