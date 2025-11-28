package org.example.multithreadoving;

public class Math extends Thread{
    private int sum;


    public Math(int sum) {
        this.sum = sum;

    }

    public void run(){
        System.out.println(sum +  " has been calculated and running on: " + Thread.currentThread().getName());
    }

    public int getSum() {
        return sum;
    }


}
