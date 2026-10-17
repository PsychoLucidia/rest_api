package com.dattci.rest_api.controllers;

import com.dattci.rest_api.config.MasterPass;
import com.dattci.rest_api.repositories.StudentRepository;
import com.dattci.rest_api.services.CustomUserDetailsService;
import com.dattci.rest_api.services.JwtService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Bean definitions for {@link LoginController}.
 */
@Generated
public class LoginController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'loginController'.
   */
  private static BeanInstanceSupplier<LoginController> getLoginControllerInstanceSupplier() {
    return BeanInstanceSupplier.<LoginController>forConstructor(MasterPass.class, StudentRepository.class, PasswordEncoder.class, AuthenticationManager.class, CustomUserDetailsService.class, JwtService.class)
            .withGenerator((registeredBean, args) -> new LoginController(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'loginController'.
   */
  public static BeanDefinition getLoginControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoginController.class);
    beanDefinition.setInstanceSupplier(getLoginControllerInstanceSupplier());
    return beanDefinition;
  }
}
