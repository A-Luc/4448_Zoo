package com.company;

public abstract class pachyderm extends animal {

    public void roam(){
        int num = getRandomNumberInRange(1,100);
        if(num <= 25){System.out.println("The pachyderms charge!");}
        else{System.out.println("The pachyderms roam together ");}
    }
    public void wake() { System.out.println("The pachyderms are awake");}
    public void sleep() { System.out.println("The pachyderms are asleep");}

    //this code to generate random number was tekn from https://mkyong.com/java/java-generate-random-integers-in-a-range/
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}

