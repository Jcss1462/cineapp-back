package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Salas;
import com.example.demo.dto.SalasDTO;


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
public interface SalasMapper {
    @Mapping(source = "estadosSala.idEstado", target = "idEstado_EstadosSala")
    @Mapping(source = "tiposDeSala.idTipo", target = "idTipo_TiposDeSala")
    public SalasDTO salasToSalasDTO(Salas salas);

    @Mapping(source = "idEstado_EstadosSala", target = "estadosSala.idEstado")
    @Mapping(source = "idTipo_TiposDeSala", target = "tiposDeSala.idTipo")
    public Salas salasDTOToSalas(SalasDTO salasDTO);

    public List<SalasDTO> listSalasToListSalasDTO(List<Salas> salass);

    public List<Salas> listSalasDTOToListSalas(List<SalasDTO> salasDTOs);
}
