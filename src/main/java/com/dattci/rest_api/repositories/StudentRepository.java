package com.dattci.rest_api.repositories;

import com.dattci.rest_api.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    // Fixes N+1 issue by using JOIN FETCH to retrieve Course and Subjects in 1 query
    @Query("SELECT DISTINCT s FROM StudentEntity s " +
            "LEFT JOIN FETCH s.course " +
            "LEFT JOIN FETCH s.enrolledSubjects")
    List<StudentEntity> findAllWithDetails();

    // Fetch a single student by ID along with Course and Subjects
    @Query("SELECT DISTINCT s FROM StudentEntity s " +
            "LEFT JOIN FETCH s.course " +
            "LEFT JOIN FETCH s.enrolledSubjects " +
            "WHERE s.id = :id")
    Optional<StudentEntity> findByIdWithDetails(@Param("id") Long id);

    // Fetch students by Course ID
    @Query("SELECT DISTINCT s FROM StudentEntity s " +
            "LEFT JOIN FETCH s.course " +
            "LEFT JOIN FETCH s.enrolledSubjects " +
            "WHERE s.course.id = :courseId")
    List<StudentEntity> findByCourseId(@Param("courseId") Long courseId);

    // Fetch students by Subject ID
    @Query("SELECT DISTINCT s FROM StudentEntity s " +
            "LEFT JOIN FETCH s.course " +
            "JOIN FETCH s.enrolledSubjects sub " +
            "WHERE sub.id = :subjectId")
    List<StudentEntity> findBySubjectId(@Param("subjectId") Long subjectId);

    @Query("SELECT DISTINCT s FROM StudentEntity s WHERE email = :email")
    Optional<StudentEntity> findByEmail(@Param("email") String email);
}
