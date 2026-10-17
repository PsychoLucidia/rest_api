package org.springframework.security.config.annotation.method.configuration;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.aot.hint.SecurityHintsRegistrar;

/**
 * Bean definitions for {@link PrePostMethodSecurityConfiguration}.
 */
@Generated
public class PrePostMethodSecurityConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for '_prePostMethodSecurityConfiguration'.
   */
  private static BeanInstanceSupplier<PrePostMethodSecurityConfiguration> getPrePostMethodSecurityConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PrePostMethodSecurityConfiguration>forConstructor(ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new PrePostMethodSecurityConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for '_prePostMethodSecurityConfiguration'.
   */
  public static BeanDefinition getPrePostMethodSecurityConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    InstanceSupplier<PrePostMethodSecurityConfiguration> instanceSupplier = getPrePostMethodSecurityConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(PrePostMethodSecurityConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'preFilterAuthorizationMethodInterceptor'.
   */
  private static BeanInstanceSupplier<MethodInterceptor> getPreFilterAuthorizationMethodInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodInterceptor>forFactoryMethod(PrePostMethodSecurityConfiguration.class, "preFilterAuthorizationMethodInterceptor", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> PrePostMethodSecurityConfiguration.preFilterAuthorizationMethodInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'preFilterAuthorizationMethodInterceptor'.
   */
  public static BeanDefinition getPreFilterAuthorizationMethodInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setTargetType(MethodInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getPreFilterAuthorizationMethodInterceptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'preAuthorizeAuthorizationMethodInterceptor'.
   */
  private static BeanInstanceSupplier<MethodInterceptor> getPreAuthorizeAuthorizationMethodInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodInterceptor>forFactoryMethod(PrePostMethodSecurityConfiguration.class, "preAuthorizeAuthorizationMethodInterceptor", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> PrePostMethodSecurityConfiguration.preAuthorizeAuthorizationMethodInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'preAuthorizeAuthorizationMethodInterceptor'.
   */
  public static BeanDefinition getPreAuthorizeAuthorizationMethodInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setTargetType(MethodInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getPreAuthorizeAuthorizationMethodInterceptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'postAuthorizeAuthorizationMethodInterceptor'.
   */
  private static BeanInstanceSupplier<MethodInterceptor> getPostAuthorizeAuthorizationMethodInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodInterceptor>forFactoryMethod(PrePostMethodSecurityConfiguration.class, "postAuthorizeAuthorizationMethodInterceptor", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> PrePostMethodSecurityConfiguration.postAuthorizeAuthorizationMethodInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'postAuthorizeAuthorizationMethodInterceptor'.
   */
  public static BeanDefinition getPostAuthorizeAuthorizationMethodInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setTargetType(MethodInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getPostAuthorizeAuthorizationMethodInterceptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'postFilterAuthorizationMethodInterceptor'.
   */
  private static BeanInstanceSupplier<MethodInterceptor> getPostFilterAuthorizationMethodInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodInterceptor>forFactoryMethod(PrePostMethodSecurityConfiguration.class, "postFilterAuthorizationMethodInterceptor", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> PrePostMethodSecurityConfiguration.postFilterAuthorizationMethodInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'postFilterAuthorizationMethodInterceptor'.
   */
  public static BeanDefinition getPostFilterAuthorizationMethodInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setTargetType(MethodInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getPostFilterAuthorizationMethodInterceptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'prePostAuthorizeExpressionHintsRegistrar'.
   */
  public static BeanDefinition getPrePostAuthorizeExpressionHintsRegistrarBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PrePostMethodSecurityConfiguration.class);
    beanDefinition.setTargetType(SecurityHintsRegistrar.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<SecurityHintsRegistrar>forFactoryMethod(PrePostMethodSecurityConfiguration.class, "prePostAuthorizeExpressionHintsRegistrar").withGenerator((registeredBean) -> PrePostMethodSecurityConfiguration.prePostAuthorizeExpressionHintsRegistrar()));
    return beanDefinition;
  }
}
