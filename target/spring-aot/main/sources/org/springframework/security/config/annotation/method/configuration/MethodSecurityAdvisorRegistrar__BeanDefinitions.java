package org.springframework.security.config.annotation.method.configuration;

import org.springframework.aop.Advisor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.authorization.method.AuthorizationAdvisor;

/**
 * Bean definitions for {@link MethodSecurityAdvisorRegistrar}.
 */
@Generated
public class MethodSecurityAdvisorRegistrar__BeanDefinitions {
  /**
   * Bean definitions for {@link MethodSecurityAdvisorRegistrar.AdvisorWrapper}.
   */
  @Generated
  public static class AdvisorWrapper {
    /**
     * Get the bean instance supplier for 'preFilterAuthorizationAdvisor'.
     */
    private static BeanInstanceSupplier<MethodSecurityAdvisorRegistrar.AdvisorWrapper> getPreFilterAuthorizationAdvisorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MethodSecurityAdvisorRegistrar.AdvisorWrapper>forFactoryMethod(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class, "of", AuthorizationAdvisor.class)
              .withGenerator((registeredBean, args) -> MethodSecurityAdvisorRegistrar.AdvisorWrapper.of(args.get(0)));
    }

    /**
     * Get the bean definition for 'preFilterAuthorizationAdvisor'.
     */
    public static BeanDefinition getPreFilterAuthorizationAdvisorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class);
      beanDefinition.setTargetType(Advisor.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("preFilterAuthorizationMethodInterceptor"));
      beanDefinition.setInstanceSupplier(getPreFilterAuthorizationAdvisorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'preAuthorizeAuthorizationAdvisor'.
     */
    private static BeanInstanceSupplier<MethodSecurityAdvisorRegistrar.AdvisorWrapper> getPreAuthorizeAuthorizationAdvisorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MethodSecurityAdvisorRegistrar.AdvisorWrapper>forFactoryMethod(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class, "of", AuthorizationAdvisor.class)
              .withGenerator((registeredBean, args) -> MethodSecurityAdvisorRegistrar.AdvisorWrapper.of(args.get(0)));
    }

    /**
     * Get the bean definition for 'preAuthorizeAuthorizationAdvisor'.
     */
    public static BeanDefinition getPreAuthorizeAuthorizationAdvisorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class);
      beanDefinition.setTargetType(Advisor.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("preAuthorizeAuthorizationMethodInterceptor"));
      beanDefinition.setInstanceSupplier(getPreAuthorizeAuthorizationAdvisorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'postFilterAuthorizationAdvisor'.
     */
    private static BeanInstanceSupplier<MethodSecurityAdvisorRegistrar.AdvisorWrapper> getPostFilterAuthorizationAdvisorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MethodSecurityAdvisorRegistrar.AdvisorWrapper>forFactoryMethod(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class, "of", AuthorizationAdvisor.class)
              .withGenerator((registeredBean, args) -> MethodSecurityAdvisorRegistrar.AdvisorWrapper.of(args.get(0)));
    }

    /**
     * Get the bean definition for 'postFilterAuthorizationAdvisor'.
     */
    public static BeanDefinition getPostFilterAuthorizationAdvisorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class);
      beanDefinition.setTargetType(Advisor.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("postFilterAuthorizationMethodInterceptor"));
      beanDefinition.setInstanceSupplier(getPostFilterAuthorizationAdvisorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'postAuthorizeAuthorizationAdvisor'.
     */
    private static BeanInstanceSupplier<MethodSecurityAdvisorRegistrar.AdvisorWrapper> getPostAuthorizeAuthorizationAdvisorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MethodSecurityAdvisorRegistrar.AdvisorWrapper>forFactoryMethod(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class, "of", AuthorizationAdvisor.class)
              .withGenerator((registeredBean, args) -> MethodSecurityAdvisorRegistrar.AdvisorWrapper.of(args.get(0)));
    }

    /**
     * Get the bean definition for 'postAuthorizeAuthorizationAdvisor'.
     */
    public static BeanDefinition getPostAuthorizeAuthorizationAdvisorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class);
      beanDefinition.setTargetType(Advisor.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("postAuthorizeAuthorizationMethodInterceptor"));
      beanDefinition.setInstanceSupplier(getPostAuthorizeAuthorizationAdvisorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'authorizeReturnObjectAdvisor'.
     */
    private static BeanInstanceSupplier<MethodSecurityAdvisorRegistrar.AdvisorWrapper> getAuthorizeReturnObjectAdvisorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MethodSecurityAdvisorRegistrar.AdvisorWrapper>forFactoryMethod(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class, "of", AuthorizationAdvisor.class)
              .withGenerator((registeredBean, args) -> MethodSecurityAdvisorRegistrar.AdvisorWrapper.of(args.get(0)));
    }

    /**
     * Get the bean definition for 'authorizeReturnObjectAdvisor'.
     */
    public static BeanDefinition getAuthorizeReturnObjectAdvisorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MethodSecurityAdvisorRegistrar.AdvisorWrapper.class);
      beanDefinition.setTargetType(Advisor.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("authorizeReturnObjectMethodInterceptor"));
      beanDefinition.setInstanceSupplier(getAuthorizeReturnObjectAdvisorInstanceSupplier());
      return beanDefinition;
    }
  }
}
