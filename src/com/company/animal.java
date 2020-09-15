package com.company;

/*
* This is the main class animal. All other subclasses will extend from this class. This class is
* declared an abstract class because some of the methods in this class will be overridden in subclasses.
* This class also includes abstract methods which are declared here to be implemented later in subclasses.
* In this class we can see clear examples of encapsulation. We have an object with attributes and methods which
* allow us to access and modify these attributes.
*/
public abstract class animal {
    public String name;
    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wake(){
        System.out.println("The animal wakes up");
    }
    public void eat(){
        System.out.println("The animal eats");
    }
    public void roam(){
        System.out.println("The animal is roaming");
    }
    public void sleep(){
        System.out.println("The animal sleeps");
    }
    public abstract void makeNoise();
}
