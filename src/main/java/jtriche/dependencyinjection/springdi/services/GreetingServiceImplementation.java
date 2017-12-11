package jtriche.dependencyinjection.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements GreetingServicesInterface {

    public static final String WHATEVER_VARIABE = "Hello Chello Jello Fellow LO LO LO";

    @Override
    public String sayGreeting(){
        return WHATEVER_VARIABE;
    }

}
