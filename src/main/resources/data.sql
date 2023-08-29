INSERT INTO patients (first_name, last_name, email) VALUES
                                                       ('John', 'Doe', 'john.doe@example.com'),
                                                       ('Jane', 'Smith', 'jane.smith@example.com');

-- Insert sample doctors
INSERT INTO doctors (first_name, last_name, specialization) VALUES
                                                               ('Dr. Michael', 'Johnson', 'Cardiology'),
                                                               ('Dr. Emily', 'Williams', 'Pediatrics');

-- Insert sample appointments
INSERT INTO appointments (appointment_date_time, patient_id, doctor_id) VALUES
                                                                           ('2023-09-01 10:00:00', 1, 1),
                                                                           ('2023-09-02 14:30:00', 2, 2);

-- Insert sample prescriptions
INSERT INTO prescription (medication, dosage, patient_id, doctor_id) VALUES
                                                                         ('Painkiller', '500mg', 1, 1),
                                                                         ('Antibiotic', '250mg', 2, 2);