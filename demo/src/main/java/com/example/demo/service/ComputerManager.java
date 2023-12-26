package com.example.demo.service;

import com.example.demo.dao.entities.computer;
import com.example.demo.service.dtos.ComputerDTO;

import java.util.List;
public interface ComputerManager {

    List<ComputerDTO>getComputerByProce(String proce);
    ComputerDTO getComputerByPrice(Float price);
    ComputerDTO savecomputer(ComputerDTO computerDTO);
    ComputerDTO deletecomputer(Long id);


}
