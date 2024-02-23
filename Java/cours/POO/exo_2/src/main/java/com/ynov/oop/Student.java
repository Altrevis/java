package com.ynov.oop;

public class Student {
    private String name;
    private Badge badge;

    public Student(String newName) {
        this.name = newName;
        this.badge = null;
        }
    public String getName() {
        return name;
        }
    public Badge getBadge() {
        return badge;
        }
    public void setBadge(Badge newBadge) {
        this.badge = newBadge;
    }
}
