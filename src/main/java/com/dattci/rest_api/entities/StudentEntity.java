package com.dattci.rest_api.entities;

import java.util.HashSet;
import java.util.Set;

import com.dattci.rest_api.enums.Roles;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles role;

    // Many Students belong to One Course
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "course_id",
        foreignKey = @ForeignKey(name = "fk_students_course")
    )
    private CourseEntity course;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "student_subjects",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    @Builder.Default
    private Set<SubjectEntity> enrolledSubjects = new HashSet<>();

    public StudentEntity() {}

    public StudentEntity(Long id, String firstName, String lastName, String email,
            String username, String password, Roles role, CourseEntity course,
            Set<SubjectEntity> enrolledSubjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.course = course;
        this.enrolledSubjects = enrolledSubjects;
    }
}