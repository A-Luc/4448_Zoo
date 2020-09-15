package com.company;

public class elephant extends pachyderm {
    @Override
    public void wake() {
        System.out.println(name +" the elephant wakes up");
    }

    @Override
    public void sleep() {
        System.out.println(name +" the elephant goes to sleep");
    }

    @Override
    public void eat() {
        System.out.println(name +" the elephant eats fruit");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the elephant rumbles");
    }

    public elephant(String name){this.setName(name);}
}
