package org.springframework.security.config.annotation.method.configuration;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.authorization.method.MethodInvocationResult;
import org.springframework.security.config.ObjectPostProcessor;

/**
 * Bean definitions for {@link MethodObservationConfiguration}.
 */
@Generated
public class MethodObservationConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'methodObservationConfiguration'.
   */
  public static BeanDefinition getMethodObservationConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodObservationConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(MethodObservationConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'methodAuthorizationManagerPostProcessor'.
   */
  private static BeanInstanceSupplier<ObjectPostProcessor> getMethodAuthorizationManagerPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObjectPostProcessor>forFactoryMethod(MethodObservationConfiguration.class, "methodAuthorizationManagerPostProcessor", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> MethodObservationConfiguration.methodAuthorizationManagerPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'methodAuthorizationManagerPostProcessor'.
   */
  public static BeanDefinition getMethodAuthorizationManagerPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodObservationConfiguration.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ObjectPostProcessor.class, ResolvableType.forClassWithGenerics(AuthorizationManager.class, MethodInvocation.class)));
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getMethodAuthorizationManagerPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'methodResultAuthorizationManagerPostProcessor'.
   */
  private static BeanInstanceSupplier<ObjectPostProcessor> getMethodResultAuthorizationManagerPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObjectPostProcessor>forFactoryMethod(MethodObservationConfiguration.class, "methodResultAuthorizationManagerPostProcessor", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> MethodObservationConfiguration.methodResultAuthorizationManagerPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'methodResultAuthorizationManagerPostProcessor'.
   */
  public static BeanDefinition getMethodResultAuthorizationManagerPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodObservationConfiguration.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ObjectPostProcessor.class, ResolvableType.forClassWithGenerics(AuthorizationManager.class, MethodInvocationResult.class)));
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getMethodResultAuthorizationManagerPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
