package com.example.bankweb.service.serivceImp;

import com.example.bankweb.dao.AppointmentDao;
import com.example.bankweb.domain.Appointment;
import com.example.bankweb.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImp implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment); }

    @Override
    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }


    // Appointment 불러오는 기능 확인
    @Override
    public Appointment findAppointment(Long id) {
        Optional<Appointment> appointment = appointmentDao.findById(id);
        return appointment.get();
    }

    @Override
    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}
