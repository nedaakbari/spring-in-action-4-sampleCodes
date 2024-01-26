package org.example.aspect;

import org.example.aspect.concert.ConcertConfig;
import org.example.aspect.concert.P;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        final P bean = context.getBean(P.class);
        bean.perform();
    }
}