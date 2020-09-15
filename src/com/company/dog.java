package com.company;

public class dog extends canine {
    @Override
    public void wake() {
        System.out.println(name +" the dog wakes up");
    }

    @Override
    public void sleep() {
        System.out.println(name +" the dog goes to sleep");
    }

    @Override
    public void eat() {
        System.out.println(name +" the dog eats kibble");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the dog barks");
    }
    public dog(String name){this.setName(name);}
}
