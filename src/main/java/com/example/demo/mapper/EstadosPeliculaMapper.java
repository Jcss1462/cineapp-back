package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosPelicula;
import com.example.demo.dto.EstadosPeliculaDTO;


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
public interface EstadosPeliculaMapper {
    public EstadosPeliculaDTO estadosPeliculaToEstadosPeliculaDTO(
        EstadosPelicula estadosPelicula);

    public EstadosPelicula estadosPeliculaDTOToEstadosPelicula(
        EstadosPeliculaDTO estadosPeliculaDTO);

    public List<EstadosPeliculaDTO> listEstadosPeliculaToListEstadosPeliculaDTO(
        List<EstadosPelicula> estadosPeliculas);

    public List<EstadosPelicula> listEstadosPeliculaDTOToListEstadosPelicula(
        List<EstadosPeliculaDTO> estadosPeliculaDTOs);
}
