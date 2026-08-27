package com.dattci.rest_api.dto;

import com.dattci.rest_api.entities.StudentEntity;
import com.dattci.rest_api.entities.SubjectEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper {
    public StudentDisplayDTO toDisplayDTO(StudentEntity student) {
        String courseName = (student.getCourse() != null) ? student.getCourse().getName() : "Unassigned";

        List<String> subjectTitles = student.getEnrolledSubjects().stream()
                .map(SubjectEntity::getTitle)
                .toList();

        return new StudentDisplayDTO(
                student.getId(),
                student.getName(),
//                student.getEmail(),
                courseName,
                subjectTitles
        );
    }
}