package org.example.multithreadoving;

public class Main {
    public static void main(String[] args) {
        AnimalRun animalRun = new AnimalRun();
        Calculate calculate = new Calculate();

        animalRun.run();
        calculate.run();
    }
}
