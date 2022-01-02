package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.ClasificacionesPelicula;
import com.example.demo.dto.ClasificacionesPeliculaDTO;


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
public interface ClasificacionesPeliculaMapper {
    public ClasificacionesPeliculaDTO clasificacionesPeliculaToClasificacionesPeliculaDTO(
        ClasificacionesPelicula clasificacionesPelicula);

    public ClasificacionesPelicula clasificacionesPeliculaDTOToClasificacionesPelicula(
        ClasificacionesPeliculaDTO clasificacionesPeliculaDTO);

    public List<ClasificacionesPeliculaDTO> listClasificacionesPeliculaToListClasificacionesPeliculaDTO(
        List<ClasificacionesPelicula> clasificacionesPeliculas);

    public List<ClasificacionesPelicula> listClasificacionesPeliculaDTOToListClasificacionesPelicula(
        List<ClasificacionesPeliculaDTO> clasificacionesPeliculaDTOs);
}
