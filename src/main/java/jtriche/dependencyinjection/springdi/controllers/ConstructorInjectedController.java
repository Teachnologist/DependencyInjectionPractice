package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;

public class ConstructorInjectedController {

    private GreetingServicesInterface greetingService;

    public ConstructorInjectedController(GreetingServicesInterface greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
