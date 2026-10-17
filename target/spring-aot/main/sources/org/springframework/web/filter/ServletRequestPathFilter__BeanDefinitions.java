package org.springframework.web.filter;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServletRequestPathFilter}.
 */
@Generated
public class ServletRequestPathFilter__BeanDefinitions {
  /**
   * Get the inner-bean definition for 'springSecurityFilterChainInnerBean'.
   */
  public static BeanDefinition getSpringSecurityFilterChainInnerBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletRequestPathFilter.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(ServletRequestPathFilter::new);
    return beanDefinition;
  }
}
