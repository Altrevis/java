package com.ynov.oop;

import java.util.ArrayList;
import java.util.Calendar;

public class Event {
    private String name;
    private Calendar date;
    private String place;
    private String description;
    private Boolean isprivate;
    private ArrayList<Participant> participant;

    public void addParticipant(Participant participant) {
        participant.add(participant);
    }
}
