package com.ynov.oop;

import java.util.Calendar;

public class Client {
    private String clientname;
    private Calendar ticketdate;
    private String tickettype;
    private int placenumber;


    public String getclientname() {
        return clientname;
    }

    public Calendar gettecketdate() {
        return ticketdate;
    }

    public String gettickettype() {
        return tickettype;
    }

    public int getplacenumber() {
        return placenumber;
    }
}
