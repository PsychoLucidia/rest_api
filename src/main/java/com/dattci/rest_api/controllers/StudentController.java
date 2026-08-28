package com.dattci.rest_api.controllers;
import com.dattci.rest_api.dto.StudentDisplayDTO;
import com.dattci.rest_api.dto.StudentMapper;
import com.dattci.rest_api.entities.CourseEntity;
import com.dattci.rest_api.entities.StudentEntity;
import com.dattci.rest_api.entities.SubjectEntity;
import com.dattci.rest_api.enums.Roles;
import com.dattci.rest_api.exeptionHandler.exceptions.ExistingAdminException;
import com.dattci.rest_api.exeptionHandler.exceptions.ExistingStudentException;
import com.dattci.rest_api.exeptionHandler.exceptions.NotFoundException;
import com.dattci.rest_api.repositories.CourseRepository;
import com.dattci.rest_api.repositories.StudentRepository;
import com.dattci.rest_api.repositories.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/admin/students")
public class StudentController {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final SubjectRepository subjectRepository;
    private final StudentMapper studentMapper;
    private final PasswordEncoder passwordEncoder;


    // GET: List all students (Formatted with Full Name, CourseEntity, Subjects)
    @GetMapping
    public ResponseEntity<List<StudentDisplayDTO>> getAllStudents() {
        List<StudentDisplayDTO> dtos = studentRepository
                .findAllWithDetails().stream()
                .map(studentMapper::toDisplayDTO)       
                .toList();
        return ResponseEntity.ok(dtos); 
    }

    // GET: Fetch a single student by ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentDisplayDTO> getStudentById(@PathVariable Long id) {
        return studentRepository.findByIdWithDetails(id)
                .map(studentMapper::toDisplayDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET: Filter students by CourseEntity ID
    //       /api/students/course/{courseId}
    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<StudentDisplayDTO>> getStudentsByCourse(@PathVariable Long courseId) {
        List<StudentDisplayDTO> dtos = studentRepository
                .findByCourseId(courseId)
                .stream()
                .map(studentMapper::toDisplayDTO)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    // GET: Filter students by SubjectEntity ID
    @GetMapping("/subject/{subjectId}")
    public ResponseEntity<List<StudentDisplayDTO>> getStudentsBySubject(@PathVariable Long subjectId) {
        List<StudentDisplayDTO> dtos = studentRepository
                .findBySubjectId(subjectId)
                .stream()
                .map(studentMapper::toDisplayDTO)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    // POST: Create a new StudentEntity
    // /api/student
    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity student) {

        Optional<StudentEntity> existingStudent = studentRepository.findByEmail(student.getEmail());

        if (!existingStudent.isEmpty()) {
            if (existingStudent.get().getRole() == Roles.ADMIN) {
                throw new ExistingAdminException(student);
            } else if (existingStudent.get().getEmail().equals(student.getEmail())) {
                throw new ExistingStudentException(student);
            }
        }

        StudentEntity saved = StudentEntity.builder()
            .firstName(student.getFirstName())
            .lastName(student.getLastName())
            .email(student.getEmail().toLowerCase())
            .username(student.getUsername())
            .password(passwordEncoder.encode(student.getPassword()))
            .role(Roles.STUDENT)
            .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // PUT: Assign CourseEntity to StudentEntity (Many-to-One)
    //      /api/student/{studentId}/course/{courseId}
    @PutMapping("/{studentId}/course/{courseId}")
    public ResponseEntity<StudentDisplayDTO> assignCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new NotFoundException("StudentEntity not found"));
        CourseEntity course = courseRepository.findById(courseId)
                .orElseThrow(() -> new NotFoundException("CourseEntity not found"));

        student.setCourse(course);
        StudentEntity updated = studentRepository.save(student);
        return ResponseEntity.ok(studentMapper.toDisplayDTO(updated));
    }

    // PUT: Enroll StudentEntity in SubjectEntity (Many-to-Many)
    //  api/student/{studentId}/subject/{subjectId}
    @PutMapping("/{studentId}/subject/{subjectId}")
    public ResponseEntity<StudentDisplayDTO> enrollSubject(@PathVariable Long studentId, @PathVariable Long subjectId) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("StudentEntity not found"));
        SubjectEntity subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new RuntimeException("SubjectEntity not found"));

        student.getEnrolledSubjects().add(subject);
        StudentEntity updated = studentRepository.save(student);
        return ResponseEntity.ok(studentMapper.toDisplayDTO(updated));
    }
}
