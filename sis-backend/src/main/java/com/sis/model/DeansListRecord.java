package com.sis.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Document(collection = "deans_list_records")
public class DeansListRecord {
    @Id
    private String id;
    private String academicYearId;
    private String studentId;
    @Field (targetType = FieldType.DECIMAL128)
    private BigDecimal yearGpa;
    private LocalDateTime generatedAt;
    private String generatedBy;

}
