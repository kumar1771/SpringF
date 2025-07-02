package org.example;

public class Pen implements Writer{
    Pen(){
        System.out.println("Pen object is created");
    }
    public void writer(){
        System.out.println("Student need pen object to print it");
    }

}
