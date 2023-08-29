package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Prescription extends BaseEntity{
    private String medication;
    private String dosage;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
}
