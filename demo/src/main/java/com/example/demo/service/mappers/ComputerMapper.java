package com.example.demo.service.mappers;

import com.example.demo.dao.entities.computer;
import com.example.demo.service.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public computer fromBookDtoToBook(ComputerDTO computerDTO){
        return this.modelMapper.map(computerDTO,computer.class);
    }

    public ComputerDTO fromBookToBookDto(computer computer ){
        return this.modelMapper.map(computer,ComputerDTO.class);
    }
}
