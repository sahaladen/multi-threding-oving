package org.example.multithreadoving;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new AnimalType("dog");
        Thread t2 = new AnimalType("cat");
        Thread t3 = new AnimalType("tiger");
        Thread t4 = new AnimalType("panda");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
