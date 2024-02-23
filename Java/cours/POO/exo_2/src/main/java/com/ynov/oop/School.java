package com.ynov.oop;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<Student>();
        }
    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
        }
    public int getNumberOfStudents() {
        return this.students.size();
        }
}
