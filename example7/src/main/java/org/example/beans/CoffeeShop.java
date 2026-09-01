package org.example.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {

    private final Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    //qualifier annotation has highest priority than primary annotation
    @Autowired
    public CoffeeShop(@Qualifier("cappuccino") Coffee coffee) {
        this.coffee = coffee;
    }
}
