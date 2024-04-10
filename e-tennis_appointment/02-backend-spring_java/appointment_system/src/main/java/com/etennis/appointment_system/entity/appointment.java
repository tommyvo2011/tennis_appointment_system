package com.etennis.appointment_system.entity;


import java.util.Date;
import java.util.Set;

import org.hibernate.mapping.OneToMany;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="appointment", schema = "public")
@Data
@Getter
@Setter
public class appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="initial_date")
    private Date initial_date;

    @Column(name="due_date")
    private Date due_date;

    @Column(name="number_of_racquets")
    private int number_of_racquets;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "customer_id")
    private customer customer;

    
    
}
