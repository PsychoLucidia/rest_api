package org.springframework.security.config.annotation.web.configuration;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.ObjectPostProcessor;
import org.springframework.security.web.FilterChainProxy;

/**
 * Bean definitions for {@link ObservationConfiguration}.
 */
@Generated
public class ObservationConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'observationConfiguration'.
   */
  public static BeanDefinition getObservationConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObservationConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(ObservationConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webAuthorizationManagerPostProcessor'.
   */
  private static BeanInstanceSupplier<ObjectPostProcessor> getWebAuthorizationManagerPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObjectPostProcessor>forFactoryMethod(ObservationConfiguration.class, "webAuthorizationManagerPostProcessor", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ObservationConfiguration.webAuthorizationManagerPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'webAuthorizationManagerPostProcessor'.
   */
  public static BeanDefinition getWebAuthorizationManagerPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObservationConfiguration.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ObjectPostProcessor.class, ResolvableType.forClassWithGenerics(AuthorizationManager.class, HttpServletRequest.class)));
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getWebAuthorizationManagerPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authenticationManagerPostProcessor'.
   */
  private static BeanInstanceSupplier<ObjectPostProcessor> getAuthenticationManagerPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObjectPostProcessor>forFactoryMethod(ObservationConfiguration.class, "authenticationManagerPostProcessor", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ObservationConfiguration.authenticationManagerPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'authenticationManagerPostProcessor'.
   */
  public static BeanDefinition getAuthenticationManagerPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObservationConfiguration.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ObjectPostProcessor.class, AuthenticationManager.class));
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getAuthenticationManagerPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'filterChainDecoratorPostProcessor'.
   */
  private static BeanInstanceSupplier<ObjectPostProcessor> getFilterChainDecoratorPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObjectPostProcessor>forFactoryMethod(ObservationConfiguration.class, "filterChainDecoratorPostProcessor", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ObservationConfiguration.filterChainDecoratorPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'filterChainDecoratorPostProcessor'.
   */
  public static BeanDefinition getFilterChainDecoratorPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObservationConfiguration.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ObjectPostProcessor.class, FilterChainProxy.FilterChainDecorator.class));
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getFilterChainDecoratorPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
