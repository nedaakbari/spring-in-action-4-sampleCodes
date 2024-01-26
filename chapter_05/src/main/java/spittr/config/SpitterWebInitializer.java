package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

// Configuring DispatcherServlet
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {//Map DispatcherServlet to /
        return new String[]{"/"};
    }

    //@Configuration class’s returned getRootConfigClasses() will be used to configure
    // the application context created by ContextLoaderListener
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }


    //The @Configuration
    //classes returned from getServletConfigClasses() will define beans
    // for DispatcherServlet’s application context
    @Override
    protected Class<?>[] getServletConfigClasses() {//Specify configuration class
        return new Class<?>[]{WebConfig.class};
    }
}