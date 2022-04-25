package com.company;

public class SmartDog extends Dog{
    int intelligence;
    public SmartDog(String name, String breed, int age, int intelligence){
        super(name, breed, age);
        this.intelligence=intelligence;
    }
    @Override
    public void printGav(){
        if (intelligence>5) System.out.println("My Coconuts!");
        else System.out.println("Alina!");
    }

    /*public void printOnDisplayDog() {
        System.out.println(name + " " + breed + " ir " + age + " gadi " + intelligence + " intellekt");
    }*/
}
