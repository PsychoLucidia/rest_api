package org.springframework.security.config.annotation.method.configuration;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.authorization.AuthorizationEventPublisher;
import org.springframework.security.authorization.AuthorizationManagerFactory;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.annotation.AnnotationTemplateExpressionDefaults;
import org.springframework.security.core.context.SecurityContextHolderStrategy;

/**
 * Autowiring for {@link PrePostMethodSecurityConfiguration}.
 */
@Generated
public class PrePostMethodSecurityConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PrePostMethodSecurityConfiguration apply(RegisteredBean registeredBean,
      PrePostMethodSecurityConfiguration instance) {
    AutowiredMethodArgumentsResolver.forMethod("setGrantedAuthorityDefaults", GrantedAuthorityDefaults.class).resolve(registeredBean, args -> instance.setGrantedAuthorityDefaults(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setRoleHierarchy", RoleHierarchy.class).resolve(registeredBean, args -> instance.setRoleHierarchy(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setAuthorizationManagerFactory", AuthorizationManagerFactory.class).resolve(registeredBean, args -> instance.setAuthorizationManagerFactory(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setTemplateDefaults", AnnotationTemplateExpressionDefaults.class).resolve(registeredBean, args -> instance.setTemplateDefaults(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setExpressionHandler", MethodSecurityExpressionHandler.class).resolve(registeredBean, args -> instance.setExpressionHandler(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setSecurityContextHolderStrategy", SecurityContextHolderStrategy.class).resolve(registeredBean, args -> instance.setSecurityContextHolderStrategy(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setAuthorizationEventPublisher", AuthorizationEventPublisher.class).resolve(registeredBean, args -> instance.setAuthorizationEventPublisher(args.get(0)));
    return instance;
  }
}
