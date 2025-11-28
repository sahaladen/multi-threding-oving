package org.example.multithreadoving;

import org.springframework.boot.SpringApplication;

public class TestMultiThreadOvingApplication {

    public static void main(String[] args) {
        SpringApplication.from(MultiThreadOvingApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
