package jtriche.dependencyinjection.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingServicesInterface {

    public String sayHey(){
        return "Hello - I am just a method in this service";
    }

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter interface using the Override annotation";
    }
}
