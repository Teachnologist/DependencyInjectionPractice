package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    public void LifeCycleBean(){
        System.out.println("## I am in the LifeSycleBean Constructore");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");
    }


    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name){
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
            System.out.println("*Pause 1");
        }
        System.out.println("## My Bean name is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated methos has been called");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("## The Predestroy annoted method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
