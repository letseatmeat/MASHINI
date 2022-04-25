package com.company;

public class Dog {
    private String name;
    String breed;
    private int age;
    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public Dog(String name){
        this.name=name;
        breed="dvornyaga" ;
        age=5;
    }

    public Dog(){
        name="Barbos";
        breed="haski";
        age=12;
    }

    public void printGav(){
        System.out.println("Ģaaav");
    }

    public void printOnDisplayDog() {
        System.out.println(name + " " + breed + " ir " + age + " gadi");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age>0 && age<30) this.age=age;
        else System.out.println("Ērror");
    }
}
