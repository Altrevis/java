package com.ynov.oop.ui.window;

import com.ynov.oop.Game;
import jexer.TApplication;
import jexer.TWindow;

public class EndGame extends TWindow {
    public EndGame(TApplication application, Game game) {
        super(application, "End Game", 50, 10, 50, 7);
        this.setCloseBox(false);
        this.setResizable(false);
        this.setZoomBox(false);
        String label = String.format("Player %s win the game", game.getCurrentPlayerName());
        addLabel(label, (this.getWidth()-label.length()-2)/2, 2);

        setY((application.getScreen().getHeight()-this.getHeight()-10)/2);
        setX((application.getScreen().getWidth()-this.getWidth())/2);
    }
}
