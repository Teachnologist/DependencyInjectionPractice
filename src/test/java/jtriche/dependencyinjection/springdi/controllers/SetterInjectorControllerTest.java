package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.After;


public class SetterInjectorControllerTest {

    private SetterInjectorController setterInjectorController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectorController = new SetterInjectorController();
        this.setterInjectorController.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImplementation.WHATEVER_VARIABE,setterInjectorController.sayChello());

    }

    @After
    public void endTest() throws Exception{
        System.out.println("Your test is complete");
    }
}
