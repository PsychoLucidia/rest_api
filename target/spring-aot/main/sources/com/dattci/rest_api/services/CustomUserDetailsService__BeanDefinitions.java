package com.dattci.rest_api.services;

import com.dattci.rest_api.repositories.StudentRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Bean definitions for {@link CustomUserDetailsService}.
 */
@Generated
public class CustomUserDetailsService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'customUserDetailsService'.
   */
  private static BeanInstanceSupplier<CustomUserDetailsService> getCustomUserDetailsServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CustomUserDetailsService>forConstructor(PasswordEncoder.class, StudentRepository.class)
            .withGenerator((registeredBean, args) -> new CustomUserDetailsService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'customUserDetailsService'.
   */
  public static BeanDefinition getCustomUserDetailsServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CustomUserDetailsService.class);
    beanDefinition.setInstanceSupplier(getCustomUserDetailsServiceInstanceSupplier());
    return beanDefinition;
  }
}
