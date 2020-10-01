package com.company;

public abstract class feline extends animal {
    public void roam(){
        System.out.println("The felines roam seperated from each other");
    }
    public void wake(){
        System.out.println("The felines are awake");
    }
    public void sleep(){
        int num = getRandomNumberInRange(1,100);
        if(num <= 30){notSleep();}
        else if(num > 30 && num <= 60){makeNoise();}
        else{toSleep();}
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    public abstract void notSleep();
    public abstract void toSleep();
}




