package org.example.multithreadoving;

public class AnimalType extends Thread{
    private String name;

    AnimalType(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + " is the animal type and is running on: " + Thread.currentThread().getName());
    }
}
