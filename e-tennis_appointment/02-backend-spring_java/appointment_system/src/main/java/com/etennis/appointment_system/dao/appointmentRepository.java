package com.etennis.appointment_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.etennis.appointment_system.entity.appointment;

@RepositoryRestResource
public interface appointmentRepository extends JpaRepository<appointment, Long>{

}
