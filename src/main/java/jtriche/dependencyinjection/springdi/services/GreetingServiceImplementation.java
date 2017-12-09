package jtriche.dependencyinjection.springdi.services;

public class GreetingServiceImplementation implements GreetingServicesInterface {

    public static final String WHATEVER_VARIABE = "Hello Chello Jello Fellow LO LO LO";

    public String sayGreeting(){
        return WHATEVER_VARIABE;
    }

}
