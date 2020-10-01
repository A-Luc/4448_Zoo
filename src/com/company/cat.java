package com.company;
/*
* This is the lowest level of subclasses. This class cat extends felines which extends animals.
* This class overrides methods from the class animal. Here we can see a good example of polymorphism.
* Since this class extends the class animal, any cat object is therefore an animal.*/
public class cat extends feline {
    @Override
    public void wake() {
        System.out.println(name +" the cat wakes up");
    }

    //This is my implementation for the special cases defined in the project guidelines
    /*@Override
    public void sleep() {
        int num = getRandomNumberInRange(1,100);
        if(num <= 30){System.out.println(name +" the cat roams around");}
        else if(num > 30 && num <= 60){makeNoise();}
        else{System.out.println(name +" the cat goes to sleep");}
    }*/

    @Override
    public void eat() {
        System.out.println(name +" the cat eats kibble");
    }

    @Override
    public void makeNoise() {
        System.out.println(name +" the cat purrs");
    }

    public cat(String name){
        this.setName(name);
    }
    //this code to generate random number was taken from https://mkyong.com/java/java-generate-random-integers-in-a-range/
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public void notSleep(){
        System.out.println(name + " the cat roams around");
    }
    public void toSleep(){
        System.out.println(name + " the cat goes to sleep");
    }
}
