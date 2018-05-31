/**
 * Created by sanchitgupta001 on 31/05/18.
 */
package org.qwerty.nit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/* BeanFactoryPostProcessor Example*/

public class BeanFactoryPostProcessorExample implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("My Bean Factory Post Processor is called");
    }
}
