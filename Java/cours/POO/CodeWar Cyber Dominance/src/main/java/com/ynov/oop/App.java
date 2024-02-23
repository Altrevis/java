package com.ynov.oop;

import com.ynov.oop.ui.Application;

public class App 
{

    public static void main(String[] args) {
        try {
            Application codeWarApplication = new Application();
            codeWarApplication.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}