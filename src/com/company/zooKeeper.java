package com.company;

public class zooKeeper extends zooEmployee {
    public void wakeAnimals(){
        System.out.println(name + " the zookeeper wakes up the animals!");
    }
    public void rollCall(){
        System.out.println(name +  " the zookeeper makes sure all animals are accounted for");
    }
    public void feed(){
        System.out.println(name +" the zookeeper feeds the animals");
    }
    public void exercise(){
        System.out.println(name +" the zookeeper lets the animals out to exercise");
    }
    public void sleep(){
        System.out.println( name +" the zookeeper puts the animals to sleep");
    }
    public void arrive(){
        System.out.println(name + " the zookeeper arrives at the zoo");
    }
    public void leave(){System.out.println(name + " the zookeeper leaves the zoo");}
    public zooKeeper(String name){this.setName(name);}
}
