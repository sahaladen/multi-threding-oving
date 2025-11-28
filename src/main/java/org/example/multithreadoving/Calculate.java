package org.example.multithreadoving;

public class Calculate {
    private Math subtraciontResult;

    private Thread t1 = new Thread(() -> addition());
    private Thread t2 = new Thread(() -> {
        try {
            subtraction();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    private Thread t3 = new Thread(() -> {
        try {
            multiplication();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    private Thread t4 = new Thread(() -> division());

    public void run() throws InterruptedException {
        t1.start();
        t4.start();
        t2.start();
        t2.join();

        t3.start();
    }



    private void subtraction() throws InterruptedException {
        int result = 2 - 1;
        subtraciontResult = new Math(result);
        subtraciontResult.start();
        subtraciontResult.join();
        System.out.println("subtraction: " + result);
    }


    private void multiplication() throws InterruptedException {
        subtraciontResult.join();

        int value = subtraciontResult.getSum();
        int reult = value * 4;
        System.out.println("multiplication: " + reult);
    }


    private void division() {
        int result = 2 / 2;
        Math math = new Math(result);
        math.start();

        System.out.println("division: " + result);
    }

    private void addition() {
        int result = 2 + 1;
        Math math = new Math(result);
        math.start();

        System.out.println("division: " + result);
    }
}
