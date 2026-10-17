package org.springframework.boot.security.oauth2.server.resource.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OAuth2ResourceServerProperties}.
 */
@Generated
public class OAuth2ResourceServerProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'oAuth2ResourceServerProperties'.
   */
  public static BeanDefinition getOAuthResourceServerPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OAuth2ResourceServerProperties.class);
    beanDefinition.setInstanceSupplier(OAuth2ResourceServerProperties::new);
    return beanDefinition;
  }
}
