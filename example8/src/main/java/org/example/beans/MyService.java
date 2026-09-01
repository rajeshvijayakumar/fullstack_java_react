package org.example.beans;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // if you're bean is stateless bean which don't store data, singleton is optional, but by default it is singleton only..
@Lazy // it will create singleton instance on the first access of the bean, rather than at the time of spring context initialization or startup of the application.
public class MyService {

    public MyService() {

        System.out.println("MyService created");
    }
}
