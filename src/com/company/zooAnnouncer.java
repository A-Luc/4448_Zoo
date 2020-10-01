package com.company;

import java.beans.PropertyChangeEvent;

public class zooAnnouncer extends zooEmployee {

    private String event;

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        this.setEvent((String) evt.getNewValue());
    }

    public String getEvent(){
        return event;
    }

    public void setEvent(String event){
        this.event = event;
    }


    public zooAnnouncer(String name){this.setName(name);}


    @Override
    public int getTime() {
        return super.getTime();
    }

    @Override
    public void setTime(int time) {
        super.setTime(time);
    }

    @Override
    public void wakeAnimals() {

    }

    @Override
    public void rollCall() {

    }

    @Override
    public void exercise() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void arrive() {
        System.out.println(name +" the zoo announcer arrives at the zoo");
    }

    @Override
    public void leave() {
        System.out.println(name +" the zoo announcer leaves the zoo");
    }

    public void lunch() {
        System.out.println("*Lunch Time!*");
    }
    public void dinner(){
        System.out.println("*Dinner Time!*");
    }
    public void close(){
        System.out.println("*The zoo is now closing!*");
    }
}
