package jtriche.dependencyinjection.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingServicesInterface {

    public String regularservicemethod(){
        return "I am regularservice method";
    }

    @Override
    public String sayGreeting() {
        return "I am in the Constructor Service Implemented by the Greeting Services Interface";
    }
}
