package com.dattci.rest_api.controllers;

import com.dattci.rest_api.dto.AddSubjectResponse;
import com.dattci.rest_api.entities.SubjectEntity;
import com.dattci.rest_api.repositories.SubjectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/admin/subjects")
public class SubjectController {
    private final SubjectRepository subjectRepository;

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

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        AddSubjectResponse body = new AddSubjectResponse(
            LocalDateTime.now().format(format),
            "Added subject to database.",
            saved.getTitle(),
            saved.getSubjectid(),
            saved.getId()
        );
        
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}
