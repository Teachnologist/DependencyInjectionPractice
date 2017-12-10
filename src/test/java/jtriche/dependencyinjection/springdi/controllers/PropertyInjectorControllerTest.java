package jtriche.dependencyinjection.springdi.controllers;


import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PropertyInjectorControllerTest {

    private PropertyInjectorController propertyInjectorController;
@Before
    public void setUp() throws Exception {
        this.propertyInjectorController = new PropertyInjectorController();
        this.propertyInjectorController.greetingService = new GreetingServiceImplementation();
    }

@Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImplementation.WHATEVER_VARIABE, propertyInjectorController.sayChello());
    }
}
