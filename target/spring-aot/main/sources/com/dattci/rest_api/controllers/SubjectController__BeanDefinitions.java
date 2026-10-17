package com.dattci.rest_api.controllers;

import com.dattci.rest_api.repositories.SubjectRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SubjectController}.
 */
@Generated
public class SubjectController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'subjectController'.
   */
  private static BeanInstanceSupplier<SubjectController> getSubjectControllerInstanceSupplier() {
    return BeanInstanceSupplier.<SubjectController>forConstructor(SubjectRepository.class)
            .withGenerator((registeredBean, args) -> new SubjectController(args.get(0)));
  }

  /**
   * Get the bean definition for 'subjectController'.
   */
  public static BeanDefinition getSubjectControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SubjectController.class);
    beanDefinition.setInstanceSupplier(getSubjectControllerInstanceSupplier());
    return beanDefinition;
  }
}
