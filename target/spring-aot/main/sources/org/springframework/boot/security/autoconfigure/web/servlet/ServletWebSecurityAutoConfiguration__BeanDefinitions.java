package org.springframework.boot.security.autoconfigure.web.servlet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletPath;
import org.springframework.security.web.servlet.util.matcher.PathPatternRequestMatcher;

/**
 * Bean definitions for {@link ServletWebSecurityAutoConfiguration}.
 */
@Generated
public class ServletWebSecurityAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'servletWebSecurityAutoConfiguration'.
   */
  public static BeanDefinition getServletWebSecurityAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebSecurityAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ServletWebSecurityAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ServletWebSecurityAutoConfiguration.PathPatternRequestMatcherBuilderConfiguration}.
   */
  @Generated
  public static class PathPatternRequestMatcherBuilderConfiguration {
    /**
     * Get the bean definition for 'pathPatternRequestMatcherBuilderConfiguration'.
     */
    public static BeanDefinition getPathPatternRequestMatcherBuilderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebSecurityAutoConfiguration.PathPatternRequestMatcherBuilderConfiguration.class);
      beanDefinition.setInstanceSupplier(ServletWebSecurityAutoConfiguration.PathPatternRequestMatcherBuilderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'pathPatternRequestMatcherBuilder'.
     */
    private static BeanInstanceSupplier<PathPatternRequestMatcher.Builder> getPathPatternRequestMatcherBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<PathPatternRequestMatcher.Builder>forFactoryMethod(ServletWebSecurityAutoConfiguration.PathPatternRequestMatcherBuilderConfiguration.class, "pathPatternRequestMatcherBuilder", DispatcherServletPath.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.security.autoconfigure.web.servlet.ServletWebSecurityAutoConfiguration$PathPatternRequestMatcherBuilderConfiguration", ServletWebSecurityAutoConfiguration.PathPatternRequestMatcherBuilderConfiguration.class).pathPatternRequestMatcherBuilder(args.get(0)));
    }

    /**
     * Get the bean definition for 'pathPatternRequestMatcherBuilder'.
     */
    public static BeanDefinition getPathPatternRequestMatcherBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(PathPatternRequestMatcher.Builder.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.security.autoconfigure.web.servlet.ServletWebSecurityAutoConfiguration$PathPatternRequestMatcherBuilderConfiguration");
      beanDefinition.setInstanceSupplier(getPathPatternRequestMatcherBuilderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link ServletWebSecurityAutoConfiguration.EnableWebSecurityConfiguration}.
   */
  @Generated
  public static class EnableWebSecurityConfiguration {
    /**
     * Get the bean definition for 'enableWebSecurityConfiguration'.
     */
    public static BeanDefinition getEnableWebSecurityConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebSecurityAutoConfiguration.EnableWebSecurityConfiguration.class);
      beanDefinition.setInstanceSupplier(ServletWebSecurityAutoConfiguration.EnableWebSecurityConfiguration::new);
      return beanDefinition;
    }
  }
}
