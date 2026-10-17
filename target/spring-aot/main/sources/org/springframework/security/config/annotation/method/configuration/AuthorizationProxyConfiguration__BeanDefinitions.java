package org.springframework.security.config.annotation.method.configuration;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.aot.hint.SecurityHintsRegistrar;
import org.springframework.security.authorization.AuthorizationProxyFactory;
import org.springframework.security.authorization.method.AuthorizationAdvisorProxyFactory;

/**
 * Bean definitions for {@link AuthorizationProxyConfiguration}.
 */
@Generated
public class AuthorizationProxyConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'authorizationProxyConfiguration'.
   */
  public static BeanDefinition getAuthorizationProxyConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationProxyConfiguration.class);
    beanDefinition.setInstanceSupplier(AuthorizationProxyConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authorizationProxyFactory'.
   */
  private static BeanInstanceSupplier<AuthorizationAdvisorProxyFactory> getAuthorizationProxyFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthorizationAdvisorProxyFactory>forFactoryMethod(AuthorizationProxyConfiguration.class, "authorizationProxyFactory", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> AuthorizationProxyConfiguration.authorizationProxyFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'authorizationProxyFactory'.
   */
  public static BeanDefinition getAuthorizationProxyFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationProxyConfiguration.class);
    beanDefinition.setTargetType(AuthorizationAdvisorProxyFactory.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getAuthorizationProxyFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'authorizeReturnObjectMethodInterceptor'.
   */
  public static BeanDefinition getAuthorizeReturnObjectMethodInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationProxyConfiguration.class);
    beanDefinition.setTargetType(MethodInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<MethodInterceptor>forFactoryMethod(AuthorizationProxyConfiguration.class, "authorizeReturnObjectMethodInterceptor").withGenerator((registeredBean) -> AuthorizationProxyConfiguration.authorizeReturnObjectMethodInterceptor()));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authorizeReturnObjectHintsRegistrar'.
   */
  private static BeanInstanceSupplier<SecurityHintsRegistrar> getAuthorizeReturnObjectHintsRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SecurityHintsRegistrar>forFactoryMethod(AuthorizationProxyConfiguration.class, "authorizeReturnObjectHintsRegistrar", AuthorizationProxyFactory.class)
            .withGenerator((registeredBean, args) -> AuthorizationProxyConfiguration.authorizeReturnObjectHintsRegistrar(args.get(0)));
  }

  /**
   * Get the bean definition for 'authorizeReturnObjectHintsRegistrar'.
   */
  public static BeanDefinition getAuthorizeReturnObjectHintsRegistrarBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationProxyConfiguration.class);
    beanDefinition.setTargetType(SecurityHintsRegistrar.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getAuthorizeReturnObjectHintsRegistrarInstanceSupplier());
    return beanDefinition;
  }
}
