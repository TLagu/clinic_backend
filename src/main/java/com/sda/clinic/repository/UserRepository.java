package com.sda.clinic.repository;

import com.sda.clinic.models.company.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUuid(UUID uuid);

    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name LIKE '%' || :role_name || '%'")
    Set<User> findByRole(@Param("role_name") String role_name);
}
