package com.sda.clinic.security.services;

import com.sda.clinic.constants.Constants;
import com.sda.clinic.models.company.clinic.ClinicDto;
import com.sda.clinic.repository.ClinicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClinicService {
    private final ClinicRepository repository;

    public Page<ClinicDto> getAll(int page) {
        Pageable pageable = PageRequest.of(page, Constants.DefaultPageSize);
        return repository.findAll(pageable).map(ClinicDto::map);
    }
}
