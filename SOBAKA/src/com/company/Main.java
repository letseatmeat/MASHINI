package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1=new Dog("Tuzik", "taksa", 7);
        Dog dog2=new Dog ("Maksik", "shpic",1);
        Dog dog3=new Dog("Lisa");
        Dog dog4=new Dog();

        dog1.printOnDisplayDog();
        dog1.setAge(1);
        dog1.setName("Sharik");
        dog1.printOnDisplayDog();

        /*dog1.printGav();
        dog1.printOnDisplayDog();
        dog2.printOnDisplayDog();
        dog3.printOnDisplayDog();
        dog4.printOnDisplayDog();*/

        /*SmartDog dog5=new SmartDog("Stepan","virtual",100, 6);
        dog5.printOnDisplayDog();
        dog5.printGav();*/
    }
}