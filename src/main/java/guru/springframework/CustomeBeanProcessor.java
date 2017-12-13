package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

@Component
public class CustomeBeanProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleBean){
            ((LifeCycleBean) bean).beforeInit();
        }
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        if(bean instanceof LifeCycleBean){
            ((LifeCycleBean) bean).afterInit();
        }
        return bean;
    }
}
