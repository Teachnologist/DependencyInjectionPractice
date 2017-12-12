package jtriche.dependencyinjection.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingServicesInterface {
    @Override
    public String sayGreeting() {
        return "\n"+"Hello from your primary service!";
    }
}

