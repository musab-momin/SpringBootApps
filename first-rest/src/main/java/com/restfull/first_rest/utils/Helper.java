package com.restfull.first_rest.utils;

import com.restfull.first_rest.dtos.SchoolDto;
import com.restfull.first_rest.dtos.StudentDto;
import com.restfull.first_rest.entities.School;
import com.restfull.first_rest.entities.Student;

public class Helper {

    public static StudentDto toStudentDto(Student dto) {
        return new StudentDto(
                dto.getFirstName(),
                dto.getLastName(),
                dto.getLastName(),
                dto.getAge()
        );
    }

    public static SchoolDto toSchoolDto(School dto) {
        return new SchoolDto(
                dto.getName()
        );
    }
}
