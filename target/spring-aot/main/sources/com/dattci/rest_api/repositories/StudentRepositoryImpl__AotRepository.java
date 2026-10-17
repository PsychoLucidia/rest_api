package com.dattci.rest_api.repositories;

import com.dattci.rest_api.entities.StudentEntity;
import com.dattci.rest_api.enums.Roles;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.repository.query.Param;

/**
 * AOT generated JPA repository implementation for {@link StudentRepository}.
 */
@Generated
public class StudentRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public StudentRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findAllWithDetails()}.
   */
  public List<StudentEntity> findAllWithDetails() {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s LEFT JOIN FETCH s.course LEFT JOIN FETCH s.enrolledSubjects";
    Query query = this.entityManager.createQuery(queryString);

    return (List<StudentEntity>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findByCourseId(java.lang.Long)}.
   */
  public List<StudentEntity> findByCourseId(@Param("courseId") Long courseId) {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s LEFT JOIN FETCH s.course LEFT JOIN FETCH s.enrolledSubjects WHERE s.course.id = :courseId";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("courseId", courseId);

    return (List<StudentEntity>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findByEmail(java.lang.String)}.
   */
  public Optional<StudentEntity> findByEmail(@Param("email") String email) {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s WHERE email = :email";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("email", email);

    return Optional.ofNullable((StudentEntity) convertOne(query.getSingleResultOrNull(), false, StudentEntity.class));
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findByIdWithDetails(java.lang.Long)}.
   */
  public Optional<StudentEntity> findByIdWithDetails(@Param("id") Long id) {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s LEFT JOIN FETCH s.course LEFT JOIN FETCH s.enrolledSubjects WHERE s.id = :id";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("id", id);

    return Optional.ofNullable((StudentEntity) convertOne(query.getSingleResultOrNull(), false, StudentEntity.class));
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findBySubjectId(java.lang.Long)}.
   */
  public List<StudentEntity> findBySubjectId(@Param("subjectId") Long subjectId) {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s LEFT JOIN FETCH s.course JOIN FETCH s.enrolledSubjects sub WHERE sub.id = :subjectId";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("subjectId", subjectId);

    return (List<StudentEntity>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link StudentRepository#findStudentsByRole(com.dattci.rest_api.enums.Roles)}.
   */
  public List<StudentEntity> findStudentsByRole(@Param("role") Roles role) {
    String queryString = "SELECT DISTINCT s FROM StudentEntity s LEFT JOIN FETCH s.course LEFT JOIN FETCH s.enrolledSubjects WHERE role = :role";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("role", role);

    return (List<StudentEntity>) query.getResultList();
  }
}
