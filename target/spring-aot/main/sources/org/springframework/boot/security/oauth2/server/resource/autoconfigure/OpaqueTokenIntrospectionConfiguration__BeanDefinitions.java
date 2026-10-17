package org.springframework.boot.security.oauth2.server.resource.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OpaqueTokenIntrospectionConfiguration}.
 */
@Generated
public class OpaqueTokenIntrospectionConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'opaqueTokenIntrospectionConfiguration'.
   */
  public static BeanDefinition getOpaqueTokenIntrospectionConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OpaqueTokenIntrospectionConfiguration.class);
    beanDefinition.setInstanceSupplier(OpaqueTokenIntrospectionConfiguration::new);
    return beanDefinition;
  }
}
