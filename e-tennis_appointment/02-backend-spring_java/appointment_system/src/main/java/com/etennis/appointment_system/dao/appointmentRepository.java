package com.etennis.appointment_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etennis.appointment_system.entity.appointment;

public interface appointmentRepository extends JpaRepository<appointment, Long>{

}
