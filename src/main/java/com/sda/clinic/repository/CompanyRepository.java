package com.sda.clinic.repository;

import com.sda.clinic.models.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
