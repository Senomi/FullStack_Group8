package com.sis.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Document (collection = "report_history")
public class ReportHistory{
    @Id 
    private String id;
    private ReportType reportType;
    private String referenceNo; 
    private String studentId;
    private Integer intakeYear;
    private String academicYearId;
    private LocalDateTime generatedAt;
    private String generatedBy;
}