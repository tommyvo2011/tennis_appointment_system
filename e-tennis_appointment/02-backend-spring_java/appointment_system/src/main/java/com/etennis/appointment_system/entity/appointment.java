package com.etennis.appointment_system.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="appointment")
@Data
@Getter
@Setter
public class appointment {


    @Column(name="customer_id")
    private Long c_id;

    @Column(name="initial_date")
    private LocalDate initial_date;

    @Column(name="due_date")
    private LocalDate due_date;
    
}
