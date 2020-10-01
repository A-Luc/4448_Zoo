package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class zooEmployee implements PropertyChangeListener {
    public String name;
    public String jobTitle;
    private int time;

    //Getters and Setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    private void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //observer pattern
    public void propertyChange(PropertyChangeEvent evt){
        this.setTime((int) evt.getNewValue());
    }

    public int getTime(){
        return time;
    }

    public void setTime(int time){
        this.time = time;
    }

    public abstract void wakeAnimals();
    public abstract void rollCall();
    public abstract void exercise();
    public abstract void sleep();
    public abstract void feed();
    public abstract void arrive();
    public abstract void leave();
}
