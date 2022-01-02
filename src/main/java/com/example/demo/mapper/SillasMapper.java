package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Sillas;
import com.example.demo.dto.SillasDTO;


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
public interface SillasMapper {
    @Mapping(source = "estadosSilla.idEstado", target = "idEstado_EstadosSilla")
    @Mapping(source = "salas.numeroSala", target = "numeroSala_Salas")
    public SillasDTO sillasToSillasDTO(Sillas sillas);

    @Mapping(source = "idEstado_EstadosSilla", target = "estadosSilla.idEstado")
    @Mapping(source = "numeroSala_Salas", target = "salas.numeroSala")
    public Sillas sillasDTOToSillas(SillasDTO sillasDTO);

    public List<SillasDTO> listSillasToListSillasDTO(List<Sillas> sillass);

    public List<Sillas> listSillasDTOToListSillas(List<SillasDTO> sillasDTOs);
}
