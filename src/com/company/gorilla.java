package com.company;

public class gorilla extends primate {
    @Override
    public void wake() {
        System.out.println(name +" the gorilla wakes up");
    }

    @Override
    public void sleep() {
        System.out.println(name +" the gorilla goes to sleep");
    }

    @Override
    public void eat() {
        System.out.println(name +" the gorilla eats bamboo");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the gorilla grunts ");
    }
    public gorilla(String name){this.setName(name);}
}
