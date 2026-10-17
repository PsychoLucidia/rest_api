package org.springframework.security.config.annotation.web.configuration;

import jakarta.servlet.Filter;
import java.lang.Object;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.security.access.expression.SecurityExpressionHandler;
import org.springframework.security.config.crypto.RsaKeyConversionServicePostProcessor;
import org.springframework.security.context.DelegatingApplicationListener;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.WebInvocationPrivilegeEvaluator;
import org.springframework.web.filter.ServletRequestPathFilter__BeanDefinitions;

/**
 * Bean definitions for {@link WebSecurityConfiguration}.
 */
@Generated
public class WebSecurityConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'webSecurityConfiguration'.
   */
  public static BeanDefinition getWebSecurityConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSecurityConfiguration.class);
    InstanceSupplier<WebSecurityConfiguration> instanceSupplier = InstanceSupplier.using(WebSecurityConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(WebSecurityConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'delegatingApplicationListener'.
   */
  public static BeanDefinition getDelegatingApplicationListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSecurityConfiguration.class);
    beanDefinition.setTargetType(DelegatingApplicationListener.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<DelegatingApplicationListener>forFactoryMethod(WebSecurityConfiguration.class, "delegatingApplicationListener").withGenerator((registeredBean) -> WebSecurityConfiguration.delegatingApplicationListener()));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webSecurityExpressionHandler'.
   */
  private static BeanInstanceSupplier<SecurityExpressionHandler> getWebSecurityExpressionHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SecurityExpressionHandler>forFactoryMethod(WebSecurityConfiguration.class, "webSecurityExpressionHandler")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration", WebSecurityConfiguration.class).webSecurityExpressionHandler());
  }

  /**
   * Get the bean definition for 'webSecurityExpressionHandler'.
   */
  public static BeanDefinition getWebSecurityExpressionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityExpressionHandler.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(SecurityExpressionHandler.class, FilterInvocation.class));
    beanDefinition.setDependsOn("springSecurityFilterChain");
    beanDefinition.setFactoryBeanName("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration");
    beanDefinition.setInstanceSupplier(getWebSecurityExpressionHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'privilegeEvaluator'.
   */
  private static BeanInstanceSupplier<WebInvocationPrivilegeEvaluator> getPrivilegeEvaluatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebInvocationPrivilegeEvaluator>forFactoryMethod(WebSecurityConfiguration.class, "privilegeEvaluator")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration", WebSecurityConfiguration.class).privilegeEvaluator());
  }

  /**
   * Get the bean definition for 'privilegeEvaluator'.
   */
  public static BeanDefinition getPrivilegeEvaluatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebInvocationPrivilegeEvaluator.class);
    beanDefinition.setDependsOn("springSecurityFilterChain");
    beanDefinition.setFactoryBeanName("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration");
    beanDefinition.setInstanceSupplier(getPrivilegeEvaluatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'conversionServicePostProcessor'.
   */
  public static BeanDefinition getConversionServicePostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSecurityConfiguration.class);
    beanDefinition.setTargetType(RsaKeyConversionServicePostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<RsaKeyConversionServicePostProcessor>forFactoryMethod(WebSecurityConfiguration.class, "conversionServicePostProcessor").withGenerator((registeredBean) -> WebSecurityConfiguration.conversionServicePostProcessor()));
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'springSecurityPathPatternParserBeanDefinitionRegistryPostProcessor'.
   */
  public static BeanDefinition getSpringSecurityPathPatternParserBeanDefinitionRegistryPostProcessorBeanDefinition(
      ) {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSecurityConfiguration.class);
    beanDefinition.setTargetType(BeanDefinitionRegistryPostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BeanDefinitionRegistryPostProcessor>forFactoryMethod(WebSecurityConfiguration.class, "springSecurityPathPatternParserBeanDefinitionRegistryPostProcessor").withGenerator((registeredBean) -> WebSecurityConfiguration.springSecurityPathPatternParserBeanDefinitionRegistryPostProcessor()));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for '(inner bean)#36b6802f'.
   */
  private static BeanInstanceSupplier<Filter> getSpringSecurityFilterChainInnerBeanInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<Filter>forFactoryMethod(WebSecurityConfiguration.class, "springSecurityFilterChain", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration", WebSecurityConfiguration.class).springSecurityFilterChain(args.get(0)));
  }

  /**
   * Get the inner-bean definition for 'springSecurityFilterChainInnerBean'.
   */
  public static BeanDefinition getSpringSecurityFilterChainInnerBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Object.class);
    beanDefinition.setDestroyMethodNames("(inferred)");
    beanDefinition.setFactoryBeanName("org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration");
    beanDefinition.setInstanceSupplier(getSpringSecurityFilterChainInnerBeanInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link WebSecurityConfiguration.CompositeFilterChainProxy}.
   */
  @Generated
  public static class CompositeFilterChainProxy {
    /**
     * Get the bean instance supplier for 'springSecurityFilterChain'.
     */
    private static BeanInstanceSupplier<WebSecurityConfiguration.CompositeFilterChainProxy> getSpringSecurityFilterChainInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WebSecurityConfiguration.CompositeFilterChainProxy>forConstructor(List.class)
              .withGenerator((registeredBean, args) -> new WebSecurityConfiguration.CompositeFilterChainProxy(args.get(0)));
    }

    /**
     * Get the bean definition for 'springSecurityFilterChain'.
     */
    public static BeanDefinition getSpringSecurityFilterChainBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSecurityConfiguration.CompositeFilterChainProxy.class);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, ManagedList.of(ServletRequestPathFilter__BeanDefinitions.getSpringSecurityFilterChainInnerBeanBeanDefinition(), WebSecurityConfiguration__BeanDefinitions.getSpringSecurityFilterChainInnerBeanBeanDefinition()));
      beanDefinition.setInstanceSupplier(getSpringSecurityFilterChainInstanceSupplier());
      return beanDefinition;
    }
  }
}
