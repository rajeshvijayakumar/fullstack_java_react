package org.example.main;

import org.example.beans.MyService;
import org.example.beans.UserSession;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        /*var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        MyService service1 = context.getBean(MyService.class);
        MyService service2 = context.getBean(MyService.class);
        System.out.println(service1 == service2); //true*/

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        UserSession userSession1 = context.getBean(UserSession.class);
        UserSession userSession2 = context.getBean(UserSession.class);
        System.out.println(userSession1 == userSession2); //true
        System.out.println(userSession1.getSessionId());
        System.out.println(userSession2.getSessionId());

    }
}
