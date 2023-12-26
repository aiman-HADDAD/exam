package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.computer;
import com.example.demo.service.dtos.ComputerDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepositories extends JpaRepository {
    ComputerDTO saveComputer(computer ComputerDtoInput);
    ComputerDTO deleteComputer(Long id );

}
