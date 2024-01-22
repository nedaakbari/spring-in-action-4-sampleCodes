package org.example.springmvc;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Main {
    public static void main(String[] args) {
        AbstractAnnotationConfigDispatcherServletInitializer
        1)   DispatcherServlet         extends FrameworkServlet
        2)   ContextLoaderListener     extends ContextLoader implements ServletContextListener



    }
}