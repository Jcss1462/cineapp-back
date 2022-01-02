package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.GenerosHasPeliculas;
import com.example.demo.dto.GenerosHasPeliculasDTO;


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
public interface GenerosHasPeliculasMapper {
    @Mapping(source = "generosPelicula.idGenero", target = "idGenero_GenerosPelicula")
    @Mapping(source = "peliculas.idPelicula", target = "idPelicula_Peliculas")
    public GenerosHasPeliculasDTO generosHasPeliculasToGenerosHasPeliculasDTO(
        GenerosHasPeliculas generosHasPeliculas);

    @Mapping(source = "idGenero_GenerosPelicula", target = "generosPelicula.idGenero")
    @Mapping(source = "idPelicula_Peliculas", target = "peliculas.idPelicula")
    public GenerosHasPeliculas generosHasPeliculasDTOToGenerosHasPeliculas(
        GenerosHasPeliculasDTO generosHasPeliculasDTO);

    public List<GenerosHasPeliculasDTO> listGenerosHasPeliculasToListGenerosHasPeliculasDTO(
        List<GenerosHasPeliculas> generosHasPeliculass);

    public List<GenerosHasPeliculas> listGenerosHasPeliculasDTOToListGenerosHasPeliculas(
        List<GenerosHasPeliculasDTO> generosHasPeliculasDTOs);
}
