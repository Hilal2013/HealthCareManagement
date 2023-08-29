package com.company.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionDTO {
    private Long id;
    @NotBlank(message = "Medication is required")
    private String medication;
    @NotBlank(message = "Medication is required")
    private String dosage;
    private Long patientId;
    private Long doctorId;
}
