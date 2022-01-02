package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosSala;
import com.example.demo.dto.EstadosSalaDTO;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
* Mapper Build with MapStruct https://mapstruct.org
* MapStruct is a code generator that greatly simplifies the
* implementation of mappings between Java bean type
* based on a convention over configuration approach.
*/
@Mapper
public interface EstadosSalaMapper {
    public EstadosSalaDTO estadosSalaToEstadosSalaDTO(EstadosSala estadosSala);

    public EstadosSala estadosSalaDTOToEstadosSala(
        EstadosSalaDTO estadosSalaDTO);

    public List<EstadosSalaDTO> listEstadosSalaToListEstadosSalaDTO(
        List<EstadosSala> estadosSalas);

    public List<EstadosSala> listEstadosSalaDTOToListEstadosSala(
        List<EstadosSalaDTO> estadosSalaDTOs);
}
