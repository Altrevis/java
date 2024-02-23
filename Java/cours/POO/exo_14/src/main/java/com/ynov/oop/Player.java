package com.ynov.oop;

public class Player {
    private PlayStyle playStyle;

    void setPlayStyle(PlayStyle p){
        this.playStyle = p;
    }
    void decideNextAction() {
        System.out.println(this.playStyle.decideNextAction());
    }
}
