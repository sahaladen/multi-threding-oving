package org.example.multithreadoving;

public class Calculate {
    private Thread t1 = new Thread(() -> addition());
    private Thread t2 = new Thread(() -> subtraction());
    private Thread t3 = new Thread(() -> multiplication());
    private Thread t4 = new Thread(() -> division());

    public void run(){
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }



    private void subtraction() {
        Math math = new Math(2,1);
        math.start();
        int result = math.getNumber1() - math.getNumber2();
        System.out.println("subtraction: " + result);
    }


    private void multiplication() {
        Math math = new Math(2,2);
        math.start();

        int result = math.getNumber1() * math.getNumber2();
        System.out.println("multiplication: " + result);
    }


    private void division() {
        Math math = new Math(2,2);
        math.start();

        int result = math.getNumber1() / math.getNumber2();
        System.out.println("division: " + result);
    }

    private void addition() {
        Math math = new Math(2,1);
        math.start();

        int result = math.getNumber1() + math.getNumber2();
        System.out.println("division: " + result);
    }
}
