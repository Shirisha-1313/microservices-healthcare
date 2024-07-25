package com.example.ust.Appointment_service.dto;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointmentdto {
    @NotNull(message="appointment id cant be null")
    @NotEmpty(message="appointment id cant be empty")
    private String appointmentId;
    @NotNull(message = "patient id cant be null")
    @NotEmpty(message="patient id cant be empty")
    private String patientId;
    @NotNull(message="doctor id cant be null")
    @NotEmpty(message="doctor id cant be empty")
    private String doctorId;
    @NotNull(message="appointment date cant be null")
    private String appointmentDate;
    @NotEmpty(message="appointment status cant be empty")
    private String appointmentTime;
    @Pattern(regexp = "^(Scheduled|Cancelled|Pending)$")
    private String status;

    public @NotNull(message = "appointment id cant be null") @NotEmpty(message = "appointment id cant be empty") String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(@NotNull(message = "appointment id cant be null") @NotEmpty(message = "appointment id cant be empty") String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public @NotNull(message = "patient id cant be null") @NotEmpty(message = "patient id cant be empty") String getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull(message = "patient id cant be null") @NotEmpty(message = "patient id cant be empty") String patientId) {
        this.patientId = patientId;
    }

    public @NotNull(message = "doctor id cant be null") @NotEmpty(message = "doctor id cant be empty") String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(@NotNull(message = "doctor id cant be null") @NotEmpty(message = "doctor id cant be empty") String doctorId) {
        this.doctorId = doctorId;
    }

    public @NotNull(message = "appointment date cant be null") String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(@NotNull(message = "appointment date cant be null") String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public @NotEmpty(message = "appointment status cant be empty") String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(@NotEmpty(message = "appointment status cant be empty") String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

