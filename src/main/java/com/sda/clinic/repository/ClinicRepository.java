package com.sda.clinic.repository;

import com.sda.clinic.models.company.clinic.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {

    Clinic getByUuid(String uuid);

}
