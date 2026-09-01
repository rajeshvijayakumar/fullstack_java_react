package org.example.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private final Engine engine;

    @Autowired
    public Vehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Vehicle bean created by Spring.");
    }
}
