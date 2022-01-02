package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Peliculas;
import com.example.demo.dto.PeliculasDTO;


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
public interface PeliculasMapper {
    @Mapping(source = "clasificacionesPelicula.idClasificacion", target = "idClasificacion_ClasificacionesPelicula")
    @Mapping(source = "estadosPelicula.idEstado", target = "idEstado_EstadosPelicula")
    public PeliculasDTO peliculasToPeliculasDTO(Peliculas peliculas);

    @Mapping(source = "idClasificacion_ClasificacionesPelicula", target = "clasificacionesPelicula.idClasificacion")
    @Mapping(source = "idEstado_EstadosPelicula", target = "estadosPelicula.idEstado")
    public Peliculas peliculasDTOToPeliculas(PeliculasDTO peliculasDTO);

    public List<PeliculasDTO> listPeliculasToListPeliculasDTO(
        List<Peliculas> peliculass);

    public List<Peliculas> listPeliculasDTOToListPeliculas(
        List<PeliculasDTO> peliculasDTOs);
}
