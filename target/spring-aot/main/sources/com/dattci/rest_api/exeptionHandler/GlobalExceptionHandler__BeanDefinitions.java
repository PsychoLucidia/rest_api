package com.dattci.rest_api.exeptionHandler;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GlobalExceptionHandler}.
 */
@Generated
public class GlobalExceptionHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'globalExceptionHandler'.
   */
  public static BeanDefinition getGlobalExceptionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GlobalExceptionHandler.class);
    beanDefinition.setInstanceSupplier(GlobalExceptionHandler::new);
    return beanDefinition;
  }
}
