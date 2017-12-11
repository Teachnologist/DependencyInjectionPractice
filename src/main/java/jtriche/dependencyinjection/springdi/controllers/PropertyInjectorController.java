package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*injects via properties kind of like js*/
@Controller
public class PropertyInjectorController {

    @Autowired
    public GreetingServiceImplementation greetingService;

    String sayChello(){
        return greetingService.sayGreeting();
    }

}
