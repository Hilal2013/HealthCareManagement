-- Insert Doctors
INSERT INTO doctors (insert_date_time, insert_user_id, last_update_date_time, last_update_user_id, is_deleted, first_name, last_name, specialization)
VALUES (CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP, 1, false, 'John', 'Doe', 'Cardiologist');

-- Insert Patients
INSERT INTO patients (insert_date_time, insert_user_id, last_update_date_time, last_update_user_id, is_deleted, first_name, last_name, email)
VALUES (CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP, 1, false, 'Jane', 'Smith', 'jane@example.com');

-- Insert Appointments
INSERT INTO appointments (insert_date_time, insert_user_id, last_update_date_time, last_update_user_id, is_deleted, appointment_date_time, patient_id, doctor_id)
VALUES (CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP, 1, false, '2023-09-01 10:00:00', 1, 1);

-- Insert Prescriptions
INSERT INTO prescription (insert_date_time, insert_user_id, last_update_date_time, last_update_user_id, is_deleted, medication, dosage, patient_id, doctor_id)
VALUES (CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP, 1, false, 'Medicine A', '2 pills daily', 1, 1);