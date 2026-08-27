package com.dattci.rest_api.repositories;

import com.dattci.rest_api.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
}
