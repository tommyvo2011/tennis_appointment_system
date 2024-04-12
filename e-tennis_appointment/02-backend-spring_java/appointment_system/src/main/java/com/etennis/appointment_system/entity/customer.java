package com.etennis.appointment_system.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")
@Data
@Getter
@Setter
public class customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long c_id;

    @Column(name="f_name")
    private String f_name;

    @Column(name="l_name") 
    private String l_name;

    @Column(name="phone_number")
    private String phone_number;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<appointment> appointments;
}
