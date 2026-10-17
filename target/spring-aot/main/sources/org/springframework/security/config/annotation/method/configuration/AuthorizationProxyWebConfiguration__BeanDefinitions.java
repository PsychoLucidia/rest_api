package org.springframework.security.config.annotation.method.configuration;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.security.authorization.method.AuthorizationAdvisorProxyFactory;

/**
 * Bean definitions for {@link AuthorizationProxyWebConfiguration}.
 */
@Generated
public class AuthorizationProxyWebConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'authorizationProxyWebConfiguration'.
   */
  public static BeanDefinition getAuthorizationProxyWebConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationProxyWebConfiguration.class);
    beanDefinition.setTargetType(AuthorizationProxyWebConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(AuthorizationProxyWebConfiguration.class);
    beanDefinition.setInstanceSupplier(AuthorizationProxyWebConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webTargetVisitor'.
   */
  private static BeanInstanceSupplier<AuthorizationAdvisorProxyFactory.TargetVisitor> getWebTargetVisitorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthorizationAdvisorProxyFactory.TargetVisitor>forFactoryMethod(AuthorizationProxyWebConfiguration$$SpringCGLIB$$0.class, "webTargetVisitor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.security.config.annotation.method.configuration.AuthorizationProxyWebConfiguration", AuthorizationProxyWebConfiguration.class).webTargetVisitor());
  }

  /**
   * Get the bean definition for 'webTargetVisitor'.
   */
  public static BeanDefinition getWebTargetVisitorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizationAdvisorProxyFactory.TargetVisitor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setFactoryBeanName("org.springframework.security.config.annotation.method.configuration.AuthorizationProxyWebConfiguration");
    beanDefinition.setInstanceSupplier(getWebTargetVisitorInstanceSupplier());
    return beanDefinition;
  }
}
