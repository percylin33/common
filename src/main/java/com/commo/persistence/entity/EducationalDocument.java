package com.commo.persistence.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashSet;

@Data
@Builder
@Table(name = "educational_document", schema = "bo_common_service")
public class EducationalDocument {
    @Id
    @Column("id_educational_document")
    private Long idEducationalDocument;

    @Column("name_document")
    private String nameDocument;

    @Column("file_name")
    private String fileName;

    @Column("id_investment_project")
    private Set<Long> idInvestmentProject = new LinkedHashSet<>();

    @Column("id_educational_document_format")
    private Set<Long> idEducationalDocumentFormat = new LinkedHashSet<>();

    @Column("id_educational_document_category")
    private Set<Long> idEducationalDocumentCategory = new LinkedHashSet<>();
 }
