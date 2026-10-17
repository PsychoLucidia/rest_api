package com.dattci.rest_api.controllers;

import com.dattci.rest_api.dto.StudentMapper;
import com.dattci.rest_api.repositories.CourseRepository;
import com.dattci.rest_api.repositories.StudentRepository;
import com.dattci.rest_api.repositories.SubjectRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Bean definitions for {@link StudentController}.
 */
@Generated
public class StudentController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'studentController'.
   */
  private static BeanInstanceSupplier<StudentController> getStudentControllerInstanceSupplier() {
    return BeanInstanceSupplier.<StudentController>forConstructor(StudentRepository.class, CourseRepository.class, SubjectRepository.class, StudentMapper.class, PasswordEncoder.class)
            .withGenerator((registeredBean, args) -> new StudentController(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'studentController'.
   */
  public static BeanDefinition getStudentControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StudentController.class);
    beanDefinition.setInstanceSupplier(getStudentControllerInstanceSupplier());
    return beanDefinition;
  }
}
