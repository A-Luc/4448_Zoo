package com.company;
/*
* This is the class canine which is a subclass of and extends the animal class. Canine is also
* an abstract class because it will be further extended by the subclasses dog and wolf.
* */
public abstract class canine extends animal {
    /*
    * In order to satisfy the special requirement: "Dog is given the exercise command by the
    * Zookeeper, there is a 25% chance the dog will dig instead of roaming". I decided to implement
    * this logic here rather than in the dog/wolf subclass. I made this decision because when i first designed
    * the layout of the project, i wanted to keep the roam command at the canine level rather than in
    * the dog/wolf subclasses. I did this because to me it made more sense that the zookeeper would
    * let all of the canines out to roam together. However, upon implementation, i realized that it doesnt
    * make sense for all of the canines to be digging at the same time.  */
    public void roam(){
        if(getRandomNumberInRange(1,100) <= 25){//get random number 1-100. If number is 1-25, i.e, 25% dogs will dig.
            System.out.println("The canines dig!");
        }
        else{ System.out.println("The canines roam in a pack");}
    }

    public void wake() {
        System.out.println("The canines are awake");
    }
    public void sleep(){
        System.out.println("The canines are asleep");
    }
    //this code to generate random number was tekn from https://mkyong.com/java/java-generate-random-integers-in-a-range/
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
