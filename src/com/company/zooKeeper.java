package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class zooKeeper extends zooEmployee {
    //**************
    private String event;
    private PropertyChangeSupport support;

    public zooKeeper(String name){
        this.setName(name);
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void setEvent(String e){
        support.firePropertyChange("Event",this.event,e);
        this.event = e;
    }
    //***************

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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        super.propertyChange(evt);
    }

    @Override
    public int getTime() {
        return super.getTime();
    }

    @Override
    public void setTime(int time) {
        super.setTime(time);
    }


}
