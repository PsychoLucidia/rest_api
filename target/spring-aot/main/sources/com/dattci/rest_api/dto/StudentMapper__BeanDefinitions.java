package com.dattci.rest_api.dto;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StudentMapper}.
 */
@Generated
public class StudentMapper__BeanDefinitions {
  /**
   * Get the bean definition for 'studentMapper'.
   */
  public static BeanDefinition getStudentMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StudentMapper.class);
    beanDefinition.setInstanceSupplier(StudentMapper::new);
    return beanDefinition;
  }
}
