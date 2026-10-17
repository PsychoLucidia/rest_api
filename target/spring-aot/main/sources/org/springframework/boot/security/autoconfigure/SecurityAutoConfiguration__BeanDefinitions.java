package org.springframework.boot.security.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;

/**
 * Bean definitions for {@link SecurityAutoConfiguration}.
 */
@Generated
public class SecurityAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'securityAutoConfiguration'.
   */
  public static BeanDefinition getSecurityAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(SecurityAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authenticationEventPublisher'.
   */
  private static BeanInstanceSupplier<DefaultAuthenticationEventPublisher> getAuthenticationEventPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultAuthenticationEventPublisher>forFactoryMethod(SecurityAutoConfiguration.class, "authenticationEventPublisher", ApplicationEventPublisher.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration", SecurityAutoConfiguration.class).authenticationEventPublisher(args.get(0)));
  }

  /**
   * Get the bean definition for 'authenticationEventPublisher'.
   */
  public static BeanDefinition getAuthenticationEventPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultAuthenticationEventPublisher.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration");
    beanDefinition.setInstanceSupplier(getAuthenticationEventPublisherInstanceSupplier());
    return beanDefinition;
  }
}
