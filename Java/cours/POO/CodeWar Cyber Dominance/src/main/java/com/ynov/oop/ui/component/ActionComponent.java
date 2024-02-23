package com.ynov.oop.ui.component;

import com.ynov.oop.Game;
import com.ynov.oop.ui.Application;
import com.ynov.oop.ui.window.EndGame;
import com.ynov.oop.ui.window.ServerWindow;
import com.ynov.oop.ui.window.Updatable;
import jexer.TAction;
import jexer.TApplication;
import jexer.TButton;
import jexer.TWindow;

public class ActionComponent extends TButton {

    public ActionComponent(ServerWindow window, String action, int x, int y, String ipAddress, Game game) {
        super(window, action, x, y, new TAction() {
            @Override
            public void DO() {
                if(game.executeActionOnServer(action, ipAddress)) {
                    if(game.currentPlayerWin()) {
                        TApplication tApp =window.getApplication();
                        if(tApp instanceof Application app) {
                            app.endGame();
                            new EndGame(tApp, game);
                        }
                        return;
                    }
                    for (TWindow w: window.getApplication().getAllWindows()) {
                        if(w instanceof Updatable updatableWindow) {
                            updatableWindow.update();
                        }
                    }
                }
            }
        });
        setEnabled(game.canExecuteActionOnServer(action, ipAddress));
    }
}
