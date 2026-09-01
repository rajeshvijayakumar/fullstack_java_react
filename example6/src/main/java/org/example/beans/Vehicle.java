package org.example.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    //@Autowired // Field Injection
    private final Engine engine;

    @Autowired
    public Vehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Vehicle bean created by Spring.");
    }

//    public Vehicle() {
//        System.out.println("Vehicle bean created by Spring.");
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    // make sure no setter method exists as constructor inejction is most recommended..
    /*@Autowired // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }*/

    @PostConstruct
    public void initialize() {
        this.name = "TATA";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
