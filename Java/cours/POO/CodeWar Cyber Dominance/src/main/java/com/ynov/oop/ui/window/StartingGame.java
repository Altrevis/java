package com.ynov.oop.ui.window;

import com.ynov.oop.Game;
import com.ynov.oop.ui.Application;
import jexer.*;

public class StartingGame extends TWindow {


    public StartingGame(Application application) {
        super(application, "Starting game", 40, 10);
        this.setCloseBox(false);
        this.setResizable(false);
        this.setZoomBox(false);

        // Player 1 input
        this.addLabel("Player 1 Name:",1, 2);
        TField player1 = this.addField(16, 2,21, false);

        // Player 2 input
        this.addLabel("Player 2 Name:",1, 4);
        TField player2 = this.addField(16, 4,21, false);

        final TWindow menuWindow = this;
        this.addButton("Start Game",(this.getWidth()-2-10)/2, 6, new TAction() {
            @Override
            public void DO() {
                String player1Name = player1.getText();
                String player2Name = player2.getText();

                Game game = new Game(player1Name, player2Name);
                application.startGame(game);
                new NextPlayer(application, game);

                menuWindow.close();
            }
        });

        setX((application.getScreen().getWidth()-this.getWidth())/2);
        setY((application.getScreen().getHeight()-this.getHeight()-10)/2);
    }
}
