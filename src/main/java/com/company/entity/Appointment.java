package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="appointments")
@Getter
@Setter
@NoArgsConstructor
public class Appointment extends BaseEntity{
    private LocalDate appointmentDateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
}
