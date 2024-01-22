package org.example.springmvc.spitter.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}