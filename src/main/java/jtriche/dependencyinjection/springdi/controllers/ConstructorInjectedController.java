package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingServicesInterface greetingService;
    //@Autowired should be placed for communication to other developers, not necessity in Constructor Injected Controllers in Spring 4+
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingServicesInterface greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
