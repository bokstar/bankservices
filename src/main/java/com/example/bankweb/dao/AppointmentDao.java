package com.example.bankweb.dao;

import com.example.bankweb.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment,Long> {

    List<Appointment> findAll();
}
