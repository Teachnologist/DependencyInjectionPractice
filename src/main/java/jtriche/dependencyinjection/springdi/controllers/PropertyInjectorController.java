package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;

/*injects via properties kind of like js*/
public class PropertyInjectorController {

    public GreetingServiceImplementation greetingService;

    String sayChello(){
        return greetingService.sayGreeting();
    }

}
