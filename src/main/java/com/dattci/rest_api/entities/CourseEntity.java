package com.dattci.rest_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // One Course has Many Students
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<StudentEntity> students = new ArrayList<>();
}
