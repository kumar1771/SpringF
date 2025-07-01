package org.example;

public class Student {
//    Student(){
//        System.out.println("I created object");
//    }
    private int age;
    private int roln;
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getRoln() {
        return roln;
    }

    public void setRoln(int roln) {
        System.out.println("Setroln method in called by spring ");
        this.roln = roln;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter method is called by spring");
        this.age = age;
    }

    public void show(){
        System.out.println("I am in method");
    }
    public void display(){
        System.out.println("I am in display method ");
    }
    public void writeExam(){
        pen.write();

    }
}
