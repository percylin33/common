package com.commo.persistence.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table(name = "educational_document_format", schema = "bo_common_service")
public class EducationalDocumentFormat {
    @Id
    @Column("id_educational_document_format")
    private Long idEducationalDocumentFormat;

    @Column("name")
    private String name;

    @Column("exception")
    private String exception;

    @Column("description")
    private String description;

    @Column("content_type")
    private String contentType;
}
