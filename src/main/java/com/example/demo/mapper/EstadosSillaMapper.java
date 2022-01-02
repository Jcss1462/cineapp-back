package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosSilla;
import com.example.demo.dto.EstadosSillaDTO;


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
public interface EstadosSillaMapper {
    public EstadosSillaDTO estadosSillaToEstadosSillaDTO(
        EstadosSilla estadosSilla);

    public EstadosSilla estadosSillaDTOToEstadosSilla(
        EstadosSillaDTO estadosSillaDTO);

    public List<EstadosSillaDTO> listEstadosSillaToListEstadosSillaDTO(
        List<EstadosSilla> estadosSillas);

    public List<EstadosSilla> listEstadosSillaDTOToListEstadosSilla(
        List<EstadosSillaDTO> estadosSillaDTOs);
}
