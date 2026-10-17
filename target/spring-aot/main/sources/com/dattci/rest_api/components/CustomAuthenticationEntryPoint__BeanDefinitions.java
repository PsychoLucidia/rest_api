package com.dattci.rest_api.components;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CustomAuthenticationEntryPoint}.
 */
@Generated
public class CustomAuthenticationEntryPoint__BeanDefinitions {
  /**
   * Get the bean definition for 'customAuthenticationEntryPoint'.
   */
  public static BeanDefinition getCustomAuthenticationEntryPointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CustomAuthenticationEntryPoint.class);
    beanDefinition.setInstanceSupplier(CustomAuthenticationEntryPoint::new);
    return beanDefinition;
  }
}
