package com.sda.clinic.security.services;

import com.sda.clinic.constants.Constants;
import com.sda.clinic.models.company.CompanyDto;
import com.sda.clinic.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Page<CompanyDto> getAll(int page) {
        return companyRepository.findAll(PageRequest.of(page, Constants.DefaultPageSize)).map(CompanyDto::map);
    }
}
