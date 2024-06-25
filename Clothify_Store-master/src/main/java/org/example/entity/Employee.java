package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String nic;
    private LocalDate dob;
    private String address;
    private String bankAccNo;
    private String bankBranch;

}


