package com.commo.persistence.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table(name = "educational_document_category", schema = "bo_common_service")
public class EducationalDocumentCategory {
    @Id
    @Column("id_educational_document_category")
    private Long idEducationalDocumentCategory;

    @Column("name")
    private String name;

    @Column("folder_name")
    private String folderName;
}
