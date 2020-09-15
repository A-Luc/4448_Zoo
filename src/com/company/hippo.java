package com.company;

public class hippo extends pachyderm {
    @Override
    public void wake() {
        System.out.println(name +" the hippo wakes up");
    }

    @Override
    public void sleep() {
        System.out.println(name +" the hippo goes to sleep");
    }

    @Override
    public void eat() {
        System.out.println(name +" the hippo eats grass");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the hippo grunts");
    }

    public hippo(String name){this.setName(name);}
}
