package org.springframework.boot.security.autoconfigure.web.servlet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SecurityFilterProperties}.
 */
@Generated
public class SecurityFilterProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'securityFilterProperties'.
   */
  public static BeanDefinition getSecurityFilterPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityFilterProperties.class);
    beanDefinition.setInstanceSupplier(SecurityFilterProperties::new);
    return beanDefinition;
  }
}
