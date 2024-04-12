package com.etennis.appointment_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.etennis.appointment_system.entity.customer;

@RepositoryRestResource
public interface customerRepository extends JpaRepository<customer, Long>{

}
