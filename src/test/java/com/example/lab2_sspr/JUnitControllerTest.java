package com.example.lab2_sspr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitControllerTest {
    @Test
    public void testHomeController() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Hello World!");
    }
    @Test
    public void testHomeController2() {
        HomeController homeController = new HomeController();
        String result = homeController.home2();
        assertEquals(result, "Hell123o");
    }
    @Test
    public void testHomeController3() {
        HomeController homeController = new HomeController();
        String result = homeController.home3();
        assertEquals(result, "H");
    }
}
