package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Funciones;
import com.example.demo.dto.FuncionesDTO;


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
public interface FuncionesMapper {
    @Mapping(source = "estadosFuncion.idEstado", target = "idEstado_EstadosFuncion")
    @Mapping(source = "peliculas.idPelicula", target = "idPelicula_Peliculas")
    @Mapping(source = "salas.numeroSala", target = "numeroSala_Salas")
    public FuncionesDTO funcionesToFuncionesDTO(Funciones funciones);

    @Mapping(source = "idEstado_EstadosFuncion", target = "estadosFuncion.idEstado")
    @Mapping(source = "idPelicula_Peliculas", target = "peliculas.idPelicula")
    @Mapping(source = "numeroSala_Salas", target = "salas.numeroSala")
    public Funciones funcionesDTOToFunciones(FuncionesDTO funcionesDTO);

    public List<FuncionesDTO> listFuncionesToListFuncionesDTO(
        List<Funciones> funcioness);

    public List<Funciones> listFuncionesDTOToListFunciones(
        List<FuncionesDTO> funcionesDTOs);
}
