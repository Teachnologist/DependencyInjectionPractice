package jtriche.dependencyinjection.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingServicesInterface {
    @Override
    public String sayGreeting() {
        return "\n" +
                "Eres el mejor ingeniero de software de todos los tiempos";
    }
}
