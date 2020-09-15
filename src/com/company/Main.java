/*
* Austin Lucas
* CSCI 4484 Project 1
* 9/16/20
*
* For the documentation of this project, since a lot of the files are similar, i.e, cat and lion are essentially
* the same class but with some minor differences, i have decided to only make comments in one of each subclass.
* The files with comments are Main.java, animal.java, canine.java, and cat.java. Each of the classes and subclasses
* clearly have their own identity which can be seen in the different class names. On the other hand, the methods all
* have a shared identity and are either overridden or extended.*/


package com.company;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        //Create array of animal objects
        animal[] animals = new animal[8];
        /* Create individual animal objects. I decided to create one of each animal. The directions say
        * "You may decide how many of each Animal live in your zoo, but there should be at least two
        * instances of each lowest level subclass". I understood this as i had to have two animals from each of the
        * lowest level subclasses. For example one lion and one cat, therefore two animals from lowest level
        * subclass of feline. I figure this is okay because no matter how many animals are in the zoo, everything
        * should still function the same way.*/
        animals[0] = new dog("Dino");
        animals[1] = new wolf("Waldo");
        animals[2] = new chimp("Charlie");
        animals[3] = new gorilla("George");
        animals[4] = new hippo("Harry");
        animals[5] = new elephant("Ethan");
        animals[6] = new cat("Carl");
        animals[7] = new lion("Leo");
        //Take input of number of days
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Zoo. Enter the number of days:");
        int days = myObj.nextInt();
        //Create zookeeper object
        zooEmployee z = new zooKeeper("Zoey");

        /* Loop for each day. Daily tasks are completed in this order: Zookeeper arrives, Zookeeper wakes up animals,
        * animals wake up, zookeeper takes role call, animals make noise, zookeeper feeds animals, animals eat,
        * zookeeper lets animals out for exercise, animals roam, zookeeper puts animals to sleep, animals sleep,
        * zookeeper leaves. Instead of going through each individual animal for each task, i created an array of
        * animals that i can loop through to make each animal perform a task specific to their subclass. */
        for(int j = 1; j < days+1; j++) {
            System.out.println("Day: " + j);
            z.arrive();
            System.out.println("");
            z.wakeAnimals();
            for (int i = 0; i < animals.length; i++) {
                animals[i].wake();
            }
            System.out.println("");
            z.rollCall();
            for (int i = 0; i < animals.length; i++) {
                animals[i].makeNoise();
            }
            System.out.println("");
            z.feed();
            for (int i = 0; i < animals.length; i++) {
                animals[i].eat();
            }
            System.out.println("");
            z.exercise();
            animals[0].roam();
            animals[2].roam();
            animals[4].roam();
            animals[6].roam();
            System.out.println("");
            z.sleep();
            for (int i = 0; i < animals.length; i++) {
                animals[i].sleep();
            }
            System.out.println("");
            z.leave();
            System.out.println("");
        }

    }

}
