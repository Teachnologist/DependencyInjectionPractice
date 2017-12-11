package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController {

    private GreetingServicesInterface greetingService;

    public String sayChello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingServicesInterface greetingService){
        this.greetingService = greetingService;
    }

    public String sayChello2(){
        return greetingService.sayGreeting()+ "\n sayChello2 this is the other public method";
    }


}
