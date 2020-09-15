package com.company;

public class lion extends feline {
    @Override
    public void wake() {
        System.out.println(name +" the lion wakes up");
    }

    @Override
    public void sleep() {
        int num = getRandomNumberInRange(1,100);
        if(num <= 30){System.out.println(name + " the lion roams around");}
        else if(num > 30 && num <= 60){makeNoise();}
        else{System.out.println(name +" the lion goes to sleep");}
    }

    @Override
    public void eat() {
        System.out.println(name +" the lion eats raw meat");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the lion roars");
    }
    public lion(String name){
        this.setName(name);
    }
    //this code to generate random number was tekn from https://mkyong.com/java/java-generate-random-integers-in-a-range/
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
