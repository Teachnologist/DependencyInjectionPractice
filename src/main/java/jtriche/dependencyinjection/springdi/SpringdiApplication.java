package jtriche.dependencyinjection.springdi;

import jtriche.dependencyinjection.springdi.controllers.SimpleCLController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(SpringdiApplication.class, args);
		SimpleCLController castedbeanfromcontroller = (SimpleCLController) appcontext.getBean("simpleCLController");
		castedbeanfromcontroller.writeline();
	}
}
