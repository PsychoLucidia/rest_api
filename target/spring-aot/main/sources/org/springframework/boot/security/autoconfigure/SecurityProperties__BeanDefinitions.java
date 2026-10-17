package org.springframework.boot.security.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SecurityProperties}.
 */
@Generated
public class SecurityProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'securityProperties'.
   */
  public static BeanDefinition getSecurityPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityProperties.class);
    beanDefinition.setInstanceSupplier(SecurityProperties::new);
    return beanDefinition;
  }
}
