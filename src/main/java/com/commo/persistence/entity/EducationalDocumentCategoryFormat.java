package com.commo.persistence.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Data
@Builder
@Table(name = "educational_document_category_format", schema = "bo_common_service")
public class EducationalDocumentCategoryFormat {
    @Column("id_educational_document_category")
    private Set<Long> idEducationalDocumentCategory;
    @Column("id_educational_document_format")
    private Set<Long> idEducationalDocumentFormat;
}
