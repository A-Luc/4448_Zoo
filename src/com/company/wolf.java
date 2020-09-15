package com.company;

public class wolf extends canine {
    @Override
    public void eat() {
        System.out.println(name+ " the wolf eats raw meat");
    }

    @Override
    public void makeNoise() {
        System.out.println(name+" the wolf howls");
    }

    @Override
    public void wake() {
        System.out.println(name+" the wolf wakes up");
    }

    @Override
    public void sleep() {
        System.out.println(name+" the wolf goes to sleep");
    }
    public wolf(String name){this.setName(name);}
}

