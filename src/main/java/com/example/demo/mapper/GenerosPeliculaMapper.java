package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.GenerosPelicula;
import com.example.demo.dto.GenerosPeliculaDTO;


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
public interface GenerosPeliculaMapper {
    public GenerosPeliculaDTO generosPeliculaToGenerosPeliculaDTO(
        GenerosPelicula generosPelicula);

    public GenerosPelicula generosPeliculaDTOToGenerosPelicula(
        GenerosPeliculaDTO generosPeliculaDTO);

    public List<GenerosPeliculaDTO> listGenerosPeliculaToListGenerosPeliculaDTO(
        List<GenerosPelicula> generosPeliculas);

    public List<GenerosPelicula> listGenerosPeliculaDTOToListGenerosPelicula(
        List<GenerosPeliculaDTO> generosPeliculaDTOs);
}
