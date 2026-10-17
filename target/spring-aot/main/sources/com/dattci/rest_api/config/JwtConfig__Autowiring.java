package com.dattci.rest_api.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link JwtConfig}.
 */
@Generated
public class JwtConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static JwtConfig apply(RegisteredBean registeredBean, JwtConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("jwtSecret").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
