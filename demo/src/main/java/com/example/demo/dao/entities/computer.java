package com.example.demo.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pc;
    private String proce;
    private  String ram;
    private Date hardDrive;
    private double price;
    private String macAddress;

}
