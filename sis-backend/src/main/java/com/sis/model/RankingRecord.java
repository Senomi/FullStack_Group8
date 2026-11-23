package com.sis.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;


@Document (collection="ranking_records")
public class RankingRecord {
    @Id 
    private String id;

    private int intakeYear;
    private RankingStream stream;
    private String studentId;
    private int rankPosition;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal gpa;
    private LocalDateTime generatedAt;
}
