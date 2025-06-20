package com.dd.ai_smart_course.Entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String description;
    private Timestamp createdAt;
}
