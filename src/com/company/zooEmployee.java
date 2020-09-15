package com.company;

public abstract class zooEmployee {
    public String name;
    public String jobTitle;

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

    public abstract void wakeAnimals();
    public abstract void rollCall();
    public abstract void exercise();
    public abstract void sleep();
    public abstract void feed();
    public abstract void arrive();
    public abstract void leave();
}
