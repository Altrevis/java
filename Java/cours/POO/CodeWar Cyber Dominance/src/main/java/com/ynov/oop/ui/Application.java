package com.ynov.oop.ui;

import com.ynov.oop.Game;
import com.ynov.oop.ui.window.EndGame;
import com.ynov.oop.ui.window.NextPlayer;
import com.ynov.oop.ui.window.StartingGame;
import jexer.*;
import jexer.event.TMenuEvent;
import jexer.menu.TMenu;

public class Application extends TApplication {

    private Game game;
    private TMenu menu;

    private boolean isGameStarted = false;

    public Application() throws Exception {
        super(BackendType.SWING,  105, 40,16);

        new StartingGame(this);
    }

    public void endGame() {
        for(TWindow w: getAllWindows()) {
            closeWindow(w);
        }
        isGameStarted = false;
        addMenu();
    }

    private void addMenu() {
        boolean menuAlreadyPresent = false;
        for(TMenu m: getAllMenus()) {
            if (m.getTitle().equals("Game")) {
                menuAlreadyPresent = true;
                break;
            }
        }
        if(menuAlreadyPresent) {
            removeMenu(menu);
        }
        menu = addMenu("Game");
        if(isGameStarted) {
            menu.addItem(100,"End turn");
            menu.addItem(200,"Concede");
        }
        menu.addItem(300,"New game");

    }

    public void startGame(Game game) {
        isGameStarted = true;
        this.game = game;
        addMenu();
    }


    /**
     * Process menu events.
     */
    @Override
    protected boolean onMenu(TMenuEvent event) {
        if(event.getId() == 100){
            for(TWindow w: getAllWindows()) {
                closeWindow(w);
            }
            game.endTurn();
            new NextPlayer(this, game);
            return true;
        }
        if(event.getId() == 200) {
            game.endTurn();
            endGame();
            new EndGame(this, game);
        }
        if(event.getId() == 300) {
            endGame();
            new StartingGame(this);
        }
        return super.onMenu(event);
    }
}

