package jtriche.dependencyinjection.springdi.controllers;


import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;


import org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test.*;

public class PropertyInjectorControllerTest {

    private PropertyInjectorController propertyInjectorController;

    public void setUp() throws Exception {
        this.propertyInjectorController = new PropertyInjectorController();
        this.propertyInjectorController.greetingService = new GreetingServiceImplementation();
    }

    @Test
    public String testGreeting() throws Exception {
        assertEquals(GreetingServiceImplementation.WHATEVER_VARIABE, propertyInjectorController.sayChello());
    }
}
