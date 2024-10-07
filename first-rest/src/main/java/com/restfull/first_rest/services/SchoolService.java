package com.restfull.first_rest.services;

import com.restfull.first_rest.dtos.SchoolDto;
import com.restfull.first_rest.entities.School;
import com.restfull.first_rest.repositories.SchoolRepository;
import com.restfull.first_rest.utils.Helper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public SchoolDto saveSchool(School schoolObj) {
        School sc = this.schoolRepository.save(schoolObj);
        return Helper.toSchoolDto(sc);
    }

    public List<SchoolDto> getAllSchool() {
        List<School> sc = this.schoolRepository.findAll();
//        List<SchoolDto> schoolDtoList = new ArrayList<>();
//        for (School item : sc) {
//            schoolDtoList.add(Helper.toSchoolDto(item));
//        }
//        return schoolDtoList;
        return sc.stream()
                .map(Helper::toSchoolDto)
                .collect(Collectors.toList());
    }

}
