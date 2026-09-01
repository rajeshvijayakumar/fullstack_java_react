package org.example.config;


import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle()); //manual wiring using method invocation
//        return person;
//    }

    @Bean
    Person person(Vehicle vehicle) { //manual wiring using method invocation
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }

}
