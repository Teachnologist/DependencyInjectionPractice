package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;
import org.springframework.stereotype.Controller;

@Controller
public class SimpleCLController {

    private GreetingServicesInterface greetingService;

    public SimpleCLController(GreetingServicesInterface greetingService){
        this.greetingService = greetingService;
    }


    public String writeline(){
        System.out.println("This was a simple exercise but never ever skip steps Jason!");
        return "This is from the greeting service primary bean:\n"+greetingService.sayGreeting();
    }
}
