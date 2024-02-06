package com.commo.persistence.repository;


import com.commo.persistence.entity.EducationalDocument;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalDocumentRepository extends ReactiveCrudRepository<EducationalDocument, Long>{

}
