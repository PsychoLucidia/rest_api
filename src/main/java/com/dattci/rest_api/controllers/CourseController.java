package com.dattci.rest_api.controllers;

import com.dattci.rest_api.dto.AddCourseResponse;
import com.dattci.rest_api.dto.DeleteCourseResponse;
import com.dattci.rest_api.entities.CourseEntity;
import com.dattci.rest_api.exeptionHandler.exceptions.NotFoundException;
import com.dattci.rest_api.repositories.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/admin/courses")
public class CourseController {
    private final CourseRepository courseRepository;

    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public ResponseEntity<List<CourseEntity>> getAllCourses() {
        return ResponseEntity.ok(courseRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<AddCourseResponse> createCourse(@RequestBody CourseEntity course) {

        CourseEntity saved = courseRepository.save(course);

        AddCourseResponse body = new AddCourseResponse(
            LocalDateTime.now().format(format),
            "Added course to database.",
            saved.getName(),
            saved.getId()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @DeleteMapping("/delete/{courseId}")
    public ResponseEntity<DeleteCourseResponse> deleteCourseById(@PathVariable Long courseId) {
        CourseEntity course = courseRepository.findById(courseId)
                .orElseThrow(() -> new NotFoundException("Course not found"));

        courseRepository.delete(course);

        DeleteCourseResponse response = new DeleteCourseResponse(
            LocalDateTime.now().format(format),
            "Course deleted successfully."
        );

        return ResponseEntity.ok(response);
    }
}