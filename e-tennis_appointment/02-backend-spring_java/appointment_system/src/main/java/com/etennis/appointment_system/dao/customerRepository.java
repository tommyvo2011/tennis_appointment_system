package com.etennis.appointment_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etennis.appointment_system.entity.customer;

public interface customerRepository extends JpaRepository<customer, Long>{

}
