package com.company;

import java.beans.PropertyChangeEvent;

public class zooFoodServer extends zooEmployee {

    public zooFoodServer(String name){this.setName(name);}

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
        System.out.println(name +" the zoo food server arrives at the zoo");
    }

    @Override
    public void leave() {
        System.out.println(name +" the zoo food server leaves the zoo");
    }

    public void makeFood() {
        System.out.println(name +" the zoo food server is making food");
    }

    public void serveFood() {
        System.out.println(name +" the zoo food server is serving food");
    }
    public void cleanFood(){
        System.out.println(name +" the zoo food server is cleaning up");
    }
}
