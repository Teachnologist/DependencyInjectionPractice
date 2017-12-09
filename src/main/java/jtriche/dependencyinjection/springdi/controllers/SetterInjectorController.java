package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;

public class SetterInjectorController {

    private GreetingServicesInterface greetingService;

    String sayChello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServicesInterface greetingService){
        this.greetingService = greetingService;
    }
}
