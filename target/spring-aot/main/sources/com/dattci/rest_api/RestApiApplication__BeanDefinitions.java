package com.dattci.rest_api;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestApiApplication}.
 */
@Generated
public class RestApiApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'restApiApplication'.
   */
  public static BeanDefinition getRestApiApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestApiApplication.class);
    beanDefinition.setInstanceSupplier(RestApiApplication::new);
    return beanDefinition;
  }
}
