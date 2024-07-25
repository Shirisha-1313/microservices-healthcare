package com.ust.Prescription.dto;

import jakarta.validation.constraints.NotEmpty;

public class Prescriptiondto {
    @NotEmpty(message="prescription id cant be null")
    private String id;
    @NotEmpty(message="patient id cant be null")
    private String patientId;
    @NotEmpty(message="doctor id cant be null")
    private String doctorId;
    @NotEmpty(message="appointment id cant be null")
    private String appointmentId;
    @NotEmpty(message="medication cant be null")
    private String medication;
    @NotEmpty(message="dosage cant be null")
    private String dosage;
    @NotEmpty(message="instructions id cant be null")
    private String instructions;

    public @NotEmpty(message = "prescription id cant be null") String getId() {
        return id;
    }

    public void setId(@NotEmpty(message = "prescription id cant be null") String id) {
        this.id = id;
    }

    public @NotEmpty(message = "patient id cant be null") String getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotEmpty(message = "patient id cant be null") String patientId) {
        this.patientId = patientId;
    }

    public @NotEmpty(message = "doctor id cant be null") String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(@NotEmpty(message = "doctor id cant be null") String doctorId) {
        this.doctorId = doctorId;
    }

    public @NotEmpty(message = "appointment id cant be null") String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(@NotEmpty(message = "appointment id cant be null") String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public @NotEmpty(message = "medication cant be null") String getMedication() {
        return medication;
    }

    public void setMedication(@NotEmpty(message = "medication cant be null") String medication) {
        this.medication = medication;
    }

    public @NotEmpty(message = "dosage cant be null") String getDosage() {
        return dosage;
    }

    public void setDosage(@NotEmpty(message = "dosage cant be null") String dosage) {
        this.dosage = dosage;
    }

    public @NotEmpty(message = "instructions id cant be null") String getInstructions() {
        return instructions;
    }

    public void setInstructions(@NotEmpty(message = "instructions id cant be null") String instructions) {
        this.instructions = instructions;
    }
}
