package com.ynov.oop;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Badge badge1 = new Badge("badge numero 98787");
        System.out.println(badge1.getId());

        Student olivierStudent = new Student("Olivier");
        olivierStudent.setBadge(badge1);
        System.out.println(olivierStudent.getName());

        olivierStudent.getBadge().check(new Date());
        System.out.println(olivierStudent.getBadge().isln());

        School  ynovSchool = new School();

        ynovSchool.addStudent(olivierStudent);
        ynovSchool.addStudent(new Student("jule"));

        System.out.println(ynovSchool.getNumberOfStudents());
    }
}