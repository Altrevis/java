package com.ynov.oop.ui.window;

import com.ynov.oop.Game;
import jexer.TAction;
import jexer.TApplication;
import jexer.TWindow;

public class NextPlayer extends TWindow {
    public NextPlayer(TApplication application, Game game) {
        super(application, "Next Player", 50, 7);
        this.setCloseBox(false);
        this.setResizable(false);
        this.setZoomBox(false);
        game.startTurn();
        String labelText = "This is " + game.getCurrentPlayerName() + " turn";


        // Player 1 input
        this.addLabel(labelText,(50 - labelText.length() - 2)/2, 1);

        final TWindow menuWindow = this;
        String buttonText = "Start turn";
        this.addButton(buttonText,(50 - buttonText.length() - 5)/2, 3, new TAction() {
            @Override
            public void DO() {
                new PlayerInformation(application, game);
                // Close the menu window when starting the game
                menuWindow.close();
            }
        });


        setY((application.getScreen().getHeight()-this.getHeight()-10)/2);
        setX((application.getScreen().getWidth()-this.getWidth())/2);
    }
}
