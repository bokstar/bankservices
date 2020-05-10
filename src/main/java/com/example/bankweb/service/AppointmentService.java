package com.example.bankweb.service;

import com.example.bankweb.domain.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);
    List<Appointment> findAll();
    Appointment findAppointment(Long id);
    void confirmAppointment(Long id);
}
