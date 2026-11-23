package com.sis.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Document (collection = "transcript_records")
public class TranscriptRecord {
    
    @Id 
    private String id;
    @Indexed (unique = true)
    private String transcriptNo;
    private String studentId;
    @Field (targetType = FieldType.DECIMAL128)
    private BigDecimal cgpa;
    private int creditsEarned;
    private DegreeClass degreeClass;
    private LocalDateTime generatedAt;
    private String generatedBy;
    
}
