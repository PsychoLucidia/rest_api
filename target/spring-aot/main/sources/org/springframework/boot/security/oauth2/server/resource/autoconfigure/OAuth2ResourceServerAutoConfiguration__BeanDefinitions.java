package org.springframework.boot.security.oauth2.server.resource.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OAuth2ResourceServerAutoConfiguration}.
 */
@Generated
public class OAuth2ResourceServerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'oAuth2ResourceServerAutoConfiguration'.
   */
  public static BeanDefinition getOAuthResourceServerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OAuth2ResourceServerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(OAuth2ResourceServerAutoConfiguration::new);
    return beanDefinition;
  }
}
