package com.dattci.rest_api.controllers;

import com.dattci.rest_api.dto.AddSubjectResponse;
import com.dattci.rest_api.dto.DeleteSubjectResponse;
import com.dattci.rest_api.entities.SubjectEntity;
import com.dattci.rest_api.exeptionHandler.exceptions.NotFoundException;
import com.dattci.rest_api.repositories.SubjectRepository;
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
@RequestMapping("/api/admin/subjects")
public class SubjectController {
    private final SubjectRepository subjectRepository;

    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @GetMapping
    public ResponseEntity<List<SubjectEntity>> getAllSubjects() {
        return ResponseEntity.ok(subjectRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<AddSubjectResponse> createSubject(@RequestBody SubjectEntity subject) {
        SubjectEntity saved = subjectRepository.save(subject);

        AddSubjectResponse body = new AddSubjectResponse(
            LocalDateTime.now().format(format),
            "Added subject to database.",
            saved.getTitle(),
            saved.getSubjectid(),
            saved.getId()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @DeleteMapping("/delete/{subjectId}")
    public ResponseEntity<DeleteSubjectResponse> deleteSubjectById(@PathVariable Long subjectId) {
        SubjectEntity subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new NotFoundException("Subject not found"));

        subjectRepository.delete(subject);

        DeleteSubjectResponse response = new DeleteSubjectResponse(
            LocalDateTime.now().format(format),
            "Subject deleted successfully."
        );

        return ResponseEntity.ok(response);
    }
}
