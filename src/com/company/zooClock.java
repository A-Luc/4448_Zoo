package com.company;


import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class zooClock {
    private int time;

    private PropertyChangeSupport support;

    public zooClock(){
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void setTime(int t){
        support.firePropertyChange("Time",this.time,t);
        this.time = t;
    }
}

