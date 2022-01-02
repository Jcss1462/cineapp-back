package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosFuncion;
import com.example.demo.dto.EstadosFuncionDTO;


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
public interface EstadosFuncionMapper {
    public EstadosFuncionDTO estadosFuncionToEstadosFuncionDTO(
        EstadosFuncion estadosFuncion);

    public EstadosFuncion estadosFuncionDTOToEstadosFuncion(
        EstadosFuncionDTO estadosFuncionDTO);

    public List<EstadosFuncionDTO> listEstadosFuncionToListEstadosFuncionDTO(
        List<EstadosFuncion> estadosFuncions);

    public List<EstadosFuncion> listEstadosFuncionDTOToListEstadosFuncion(
        List<EstadosFuncionDTO> estadosFuncionDTOs);
}
