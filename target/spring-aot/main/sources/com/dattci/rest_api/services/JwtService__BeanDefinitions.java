package com.dattci.rest_api.services;

import javax.crypto.SecretKey;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JwtService}.
 */
@Generated
public class JwtService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jwtService'.
   */
  private static BeanInstanceSupplier<JwtService> getJwtServiceInstanceSupplier() {
    return BeanInstanceSupplier.<JwtService>forConstructor(SecretKey.class, long.class)
            .withGenerator((registeredBean, args) -> new JwtService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'jwtService'.
   */
  public static BeanDefinition getJwtServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JwtService.class);
    beanDefinition.setInstanceSupplier(getJwtServiceInstanceSupplier());
    return beanDefinition;
  }
}
