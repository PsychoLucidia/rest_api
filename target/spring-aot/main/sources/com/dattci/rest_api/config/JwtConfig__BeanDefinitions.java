package com.dattci.rest_api.config;

import javax.crypto.SecretKey;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.security.oauth2.jwt.JwtDecoder;

/**
 * Bean definitions for {@link JwtConfig}.
 */
@Generated
public class JwtConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'jwtConfig'.
   */
  public static BeanDefinition getJwtConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JwtConfig.class);
    beanDefinition.setTargetType(JwtConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(JwtConfig.class);
    InstanceSupplier<JwtConfig> instanceSupplier = InstanceSupplier.using(JwtConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(JwtConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jSecretKey'.
   */
  private static BeanInstanceSupplier<SecretKey> getJSecretKeyInstanceSupplier() {
    return BeanInstanceSupplier.<SecretKey>forFactoryMethod(JwtConfig$$SpringCGLIB$$0.class, "jSecretKey")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("jwtConfig", JwtConfig.class).jSecretKey());
  }

  /**
   * Get the bean definition for 'jSecretKey'.
   */
  public static BeanDefinition getJSecretKeyBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecretKey.class);
    beanDefinition.setFactoryBeanName("jwtConfig");
    beanDefinition.setInstanceSupplier(getJSecretKeyInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jwtDecoder'.
   */
  private static BeanInstanceSupplier<JwtDecoder> getJwtDecoderInstanceSupplier() {
    return BeanInstanceSupplier.<JwtDecoder>forFactoryMethod(JwtConfig$$SpringCGLIB$$0.class, "jwtDecoder", SecretKey.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("jwtConfig", JwtConfig.class).jwtDecoder(args.get(0)));
  }

  /**
   * Get the bean definition for 'jwtDecoder'.
   */
  public static BeanDefinition getJwtDecoderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JwtDecoder.class);
    beanDefinition.setFactoryBeanName("jwtConfig");
    beanDefinition.setInstanceSupplier(getJwtDecoderInstanceSupplier());
    return beanDefinition;
  }
}
