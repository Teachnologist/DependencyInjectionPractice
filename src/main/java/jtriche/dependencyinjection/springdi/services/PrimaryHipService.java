package jtriche.dependencyinjection.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hip")
public class PrimaryHipService implements GreetingServicesInterface {
    @Override
    public String sayGreeting() {
        return "Ain't no coder fresh as I'm is";
    }
}
