/*
* Austin Lucas
* CSCI 4484 Project 1
* 9/16/20
*
* Project 1
* For the documentation of this project, since a lot of the files are similar, i.e, cat and lion are essentially
* the same class but with some minor differences, i have decided to only make comments in one of each subclass.
* The files with comments are Main.java, animal.java, canine.java, and cat.java. Each of the classes and subclasses
* clearly have their own identity which can be seen in the different class names. On the other hand, the methods all
* have a shared identity and are either overridden or extended.
*
* Project 2
* New to project two is the addition of 3 classes. ZooAnnouncer, ZooClock, and ZooFoodServer. I have also implemented
* a new loop which runs the zoo in accordance to all project 2 requirements. I have decided to keep the old code from
* project 1 at the bottom for reference.  */


package com.company;
import java.util.Scanner;

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


        //Create observable/observer zookeeper object
        zooKeeper Keeper = new zooKeeper("Zoey");
        //create observable clock
        zooClock observable = new zooClock();
        //create observer zooAnnouncer object
        zooAnnouncer Announcer = new zooAnnouncer("Andy");
        //create observer zooFoodServer object
        zooFoodServer  Server = new zooFoodServer("Stevie");
        //Add the announcer as an observer to the zookeeper
        Keeper.addPropertyChangeListener(Announcer);
        //add zookeeper as an observer to zooclock
        observable.addPropertyChangeListener(Keeper);
        //add server as an observer to zooclock
        observable.addPropertyChangeListener(Server);


        /* New loop for daily tasks which adheres to project 2 guidelines. My original loop can be seen commented at
        * the bottom of the file. This new loop includes the use of two additional zoo employees, the announcer and
        * the food server. This new loop also implements the observer pattern which i have applied in a few different
        * places. The first and most important observer pattern that i implemented is between the zooClock as the
        * observable and the zoo keeper and zoo food server as the observers. The zoo clock creates an observable
        * integer for each hour that the zoo is operating. The zoo keeper and the food server observe this integer
        * and complete tasks based on the observed time of day. The other place i have implemented the observer
        * pattern, as in accordance to 1b from the project guidelines, is between the announcer and keeper. Whenever the
        * keeper completes a task, the keeper first creates an observable string that describes their task. The
        * announcer then observes this task and announces to the zoo that this task is about to be completed. */
        //days
        for(int j = 1; j < days+1; j++) {
            System.out.println("Day: " + j);
            //time
            for (int x = 8; x < 21; x++) {
                System.out.println();
                observable.setTime(x);
                //8:00 am
                if(Keeper.getTime() == 8){
                    System.out.println(Keeper.getTime() + ":00 AM");
                    Keeper.arrive();
                    Announcer.arrive();
                    Server.arrive();
                    System.out.println("*Good morning, this is the zoo announcer. All employees have arrived.*");
                }
                //9:00
                else if(Keeper.getTime() == 9){
                    System.out.println(Keeper.getTime() + ":00 AM");
                    //ZooKeeper creating observable event
                    Keeper.setEvent(" the zookeeper is about to wake the animals!*");
                    //Announcer observing the event created by the zookeeper and announcing it to the zoo
                    System.out.println("*This is the zoo announcer, "+ Keeper.name + Announcer.getEvent());
                    Keeper.wakeAnimals();
                    for (int i = 0; i < animals.length; i++) {
                        animals[i].wake();
                    }
                    Server.makeFood();
                }
                //10:00
                else if(Keeper.getTime() == 10){
                    System.out.println(Keeper.getTime() + ":00 AM");
                    Keeper.setEvent(" the zookeeper is about to take roll call of the animals!*");
                    System.out.println("*This is the zoo announcer, " + Keeper.name + Announcer.getEvent() );
                    Keeper.rollCall();
                    for (int i = 0; i < animals.length; i++) {
                        animals[i].makeNoise();
                    }
                }
                //11:00
                else if (Keeper.getTime() == 11){
                    System.out.println(Keeper.getTime() + ":00 AM");
                    Keeper.setEvent(" the zookeeper is about to feed the animals!*");
                    System.out.println("*This is the zoo announcer, " + Keeper.name + Announcer.getEvent() );
                    Keeper.feed();
                    for (int i = 0; i < animals.length; i++) {
                        animals[i].eat();
                    }
                }
                //12:00
                else if (Server.getTime() == 12){
                    System.out.println(Keeper.getTime() + ":00 PM");
                    Announcer.lunch();
                    Server.serveFood();

                }
                //1:00
                else if(Keeper.getTime() == 13){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Keeper.setEvent(" the zookeeper is about to exercise the animals!*");
                    System.out.println("*This is the zoo announcer, " + Keeper.name + Announcer.getEvent() );
                    Keeper.exercise();
                    animals[0].roam();
                    animals[2].roam();
                    animals[4].roam();
                    animals[6].roam();
                    Server.cleanFood();
                }
                //2:00
                else if(Keeper.getTime() == 14){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                }
                //3:00
                else if (Server.getTime() == 15 ){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Server.makeFood();
                }
                //4:00
                else if(Keeper.getTime() == 16){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                }
                //5:00
                else if (Server.getTime() == 17){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Announcer.dinner();
                    Server.serveFood();
                }
                //6:00
                else if(Server.getTime() == 18){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Server.cleanFood();
                }
                //7:00
                else if (Keeper.getTime() == 19){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Keeper.setEvent(" the zookeeper is about to put the animals to bed!*");
                    System.out.println("*This is the zoo announcer, " + Keeper.name + Announcer.getEvent() );
                    Keeper.sleep();
                    for (int i = 0; i < animals.length; i++) {
                        animals[i].sleep();
                    }
                }
                //8:00
                else if(Keeper.getTime() == 20){
                    System.out.println((Keeper.getTime()-12) + ":00 PM");
                    Announcer.close();
                    Server.leave();
                    Announcer.leave();
                    Keeper.leave();
                    System.out.println();
                }
            }
        }
    }
}

/* PROJECT 1 Loop for each day. Daily tasks are completed in this order: Zookeeper arrives, Zookeeper wakes up animals,
 * animals wake up, zookeeper takes role call, animals make noise, zookeeper feeds animals, animals eat,
 * zookeeper lets animals out for exercise, animals roam, zookeeper puts animals to sleep, animals sleep,
 * zookeeper leaves. Instead of going through each individual animal for each task, i created an array of
 * animals that i can loop through to make each animal perform a task specific to their subclass. */
        /*for(int j = 1; j < days+1; j++) {
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
*/
