package com.ynov.oop;

import java.util.ArrayList;
import java.util.Date;


public class Badge {
    private String id;
    private ArrayList<Date> registeredCheck;

    public Badge(String newid) {
        this.id = newid;
        this.registeredCheck = new ArrayList<>();
        }
    public String getId() {
        return id;
        }
    public char[] getName() {
        return null;
    }
    public void check(Date date) {
        registeredCheck.add(date);
    }
    public Boolean isln() {
        return registeredCheck.size() %2 != 0;
    }
}
