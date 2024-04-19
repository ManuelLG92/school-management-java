package com.education.management.student.infrastructure.controllers.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDto {

    private String id;
    @NotEmpty
    @Size(min = 2)
    private String name;

    @Email
    private String email;

    @NotNull
    @Min(value = 5)
    private Integer age;


    @Min(value = 1)
    @Max(value = 10)
    private Integer grade;

    @Size(min = 2)
    private String section;

    public StudentDto(String name, String email, Integer age, Integer grade, String section) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.section = section;
    }

}
