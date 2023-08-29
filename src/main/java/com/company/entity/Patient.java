package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="patients")
@Getter
@Setter
@NoArgsConstructor
public class Patient extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
}
