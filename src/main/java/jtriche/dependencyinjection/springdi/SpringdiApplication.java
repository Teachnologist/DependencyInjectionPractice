package jtriche.dependencyinjection.springdi;

import jtriche.dependencyinjection.springdi.controllers.ConstructorInjectedController;
import jtriche.dependencyinjection.springdi.controllers.PropertyInjectorController;
import jtriche.dependencyinjection.springdi.services.GreetingServiceImplementation;

import jtriche.dependencyinjection.springdi.controllers.SetterInjectorController;

import jtriche.dependencyinjection.springdi.controllers.SimpleCLController;
import jtriche.dependencyinjection.springdi.services.GreetingServicesInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(SpringdiApplication.class, args);

		/*property injected controller without bean*/
		PropertyInjectorController picnorm = new PropertyInjectorController();
		picnorm.greetingService = new GreetingServiceImplementation();
		System.out.println("PropertyInjectorController Without Bean: "+picnorm.greetingService.sayGreeting());


		/*property injected controller with bean
		* Service class must be annotated as Service and the method must be annotated as Override in the implementation class
		* */

		PropertyInjectorController picbean = appcontext.getBean(PropertyInjectorController.class);
		System.out.println("PropertyInjectorController With Bean: "+picbean.greetingService.sayGreeting());

		/*setter injected controller without bean*/
		SetterInjectorController becauseIhaveto = new SetterInjectorController();
		becauseIhaveto.setGreetingService(new GreetingServiceImplementation());

		/*has to have publicly exposed method to actually be made available for use, hence 'hello2'*/
		System.out.println("SetterInjectorController Without Bean: "+becauseIhaveto.sayChello());
		System.out.println("SetterInjectorController Without Bean: "+becauseIhaveto.sayChello2());

		/*setter injected controller with bean
		 * Service class must be annotated as Service and the method must be annotated as Override in the implementation class
		 * */

		SetterInjectorController sicbean = appcontext.getBean(SetterInjectorController.class);
		System.out.println("SetterInjectorController With Bean: "+sicbean.sayChello());


		/*sconstructor injected controller without bean*/
		ConstructorInjectedController cicnorm = new ConstructorInjectedController(new GreetingServiceImplementation());
		/*again, make sure method (sayHello) is publicly available; tests will work work if the function is just given a type with no public or private or static keyword, but it won't be accessible in other methods*/
		System.out.println("ConstructorInjectorController Without Bean: "+cicnorm.sayHello());

		/*setter injected controller with bean
		 * Service class must be annotated as Service and the method must be annotated as Override in the implementation class
		 @Autowired should be placed for communication to other developers, not necessity in Constructor Injected Controllers in Spring 4+

		 * */

		ConstructorInjectedController cicbean = appcontext.getBean(ConstructorInjectedController.class);
		System.out.println("ConstructorInjectorController With Bean message:  @Autowired should be placed for communication to other developers, not necessity in Constructor Injected Controllers in Spring 4+\n"+cicbean.sayHello());
		System.out.println("ConstructorInjectorController With Bean: "+cicbean.sayHello());




		/*use of bean example*/
		SimpleCLController castedbeanfromcontroller = (SimpleCLController) appcontext.getBean("simpleCLController");
		System.out.println(castedbeanfromcontroller.writeline());

	}
}
