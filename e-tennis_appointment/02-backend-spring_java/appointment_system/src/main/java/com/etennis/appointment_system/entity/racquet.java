package com.etennis.appointment_system.entity;

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
@Table(name="racquet_info")
@Data
@Getter
@Setter
public class racquet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="racquet_id")
    private int racquet_id;

    @Column(name="racquet_pattern")
    private String racquet_pattern;

    @Column(name="racquet_grip")
    private int grip_size;
    
    
}
