package com.example.demo.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ComputerDTO {
    private String proce;
    private  String ram;
    private Date hardDrive;
    private double price;
}
