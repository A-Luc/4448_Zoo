package com.company;

public class chimp extends primate {
    @Override
    public void wake() {
        System.out.println(name + " the chimp wakes up");
    }

    @Override
    public void sleep() {
        System.out.println( name + " the chimp goes to sleep");
    }

    @Override
    public void eat() {
        System.out.println(name + " the chimp eats fruit");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " the chimp hoots");
    }
    public chimp(String name){
        this.setName(name);
    }
}
