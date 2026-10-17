package com.dattci.rest_api.controllers;

import com.dattci.rest_api.repositories.CourseRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CourseController}.
 */
@Generated
public class CourseController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'courseController'.
   */
  private static BeanInstanceSupplier<CourseController> getCourseControllerInstanceSupplier() {
    return BeanInstanceSupplier.<CourseController>forConstructor(CourseRepository.class)
            .withGenerator((registeredBean, args) -> new CourseController(args.get(0)));
  }

  /**
   * Get the bean definition for 'courseController'.
   */
  public static BeanDefinition getCourseControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CourseController.class);
    beanDefinition.setInstanceSupplier(getCourseControllerInstanceSupplier());
    return beanDefinition;
  }
}
