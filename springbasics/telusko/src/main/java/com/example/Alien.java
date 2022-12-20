package com.example;

public class Alien {

    private int age;
    private Laptop lap;
    public void code(){
        System.out.println("I'm Coding...");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien object created!");
    }
}
