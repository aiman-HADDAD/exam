package com.example.demo.service.mappers;


import com.example.demo.service.ComputerManager;
import com.example.demo.dao.repositories.ComputerRepositories;
import com.example.demo.service.dtos.ComputerDTO;
import com.example.demo.service.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputerManagerAction implements ComputerManager {
    @Autowired
    private ComputerRepositories computerRepositories;

    @Autowired
    private ComputerMapper computerMapper;


    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        return null;
    }

    @Override
    public ComputerDTO getComputerByPrice(Float price) {
        return null;
    }

    @Override
    public ComputerDTO savecomputer(ComputerDTO computerDTO) {
        return null;
    }

    @Override
    public ComputerDTO deletecomputer(Long id) {
        return null;
    }
}
