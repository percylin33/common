package com.commo.persistence.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table(name = "investment_project", schema = "bo_common_service")
public class InvestmentProject {
    @Id
    @Column("investment_project")
    private Long investmentProject;

    @Column("name_project")
    private String nameProject;
}
