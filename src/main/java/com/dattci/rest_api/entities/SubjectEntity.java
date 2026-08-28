package com.dattci.rest_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "subjects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_id")
    private String subjectid;

    @Column(name = "title")
    private String title;

    // Many Subjects belong to Many Students
    @ManyToMany(mappedBy = "enrolledSubjects")
    private Set<StudentEntity> students = new HashSet<>();
}