package jtriche.dependencyinjection.springdi.controllers;

import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*injects via properties kind of like js*/
@Controller
public class PropertyInjectorController {

    @Autowired
    /*specifying EXACTLY which greeting service is injected*/
    @Qualifier("greetingServiceImplementation")
    public GreetingServiceImplementation greetingService;

    String sayChello(){
        return "Say CHello: "+greetingService.sayGreeting();
    }

}
