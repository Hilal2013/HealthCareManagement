package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDTO {
    private Long id;
    @DateTimeFormat(pattern = "MMMM dd,yyyy")
    private LocalDate appointmentDateTime;
    private Long patientId;
    private Long doctorId;
}
