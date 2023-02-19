package com.sda.clinic.models.company.user;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDetails extends CompanyBase {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @NotNull
    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 50)
    @Column(name = "second_name")
    private String secondName;
    @NotNull
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 11)
    private String pesel;
    @Size(max = 20)
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "birth_day")
    private LocalDate birthDay;
    @Size(max = 13)
    private String nip;
}
