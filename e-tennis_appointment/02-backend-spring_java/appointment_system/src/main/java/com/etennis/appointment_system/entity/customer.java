package com.etennis.appointment_system.entity;

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
@Table(name="customer_info")
@Data
@Getter
@Setter
public class customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long c_id;

    @Column(name="first_name")
    private String f_name;

    @Column(name="last_name")
    private String l_name;

    @Column(name="racquet_owned_by_id")
    private int racquet_owned_by_id;

    @Column(name="phone_number")
    private String phone_number;
}
