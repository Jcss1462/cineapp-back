package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosUsuario;
import com.example.demo.dto.EstadosUsuarioDTO;


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
public interface EstadosUsuarioMapper {
    public EstadosUsuarioDTO estadosUsuarioToEstadosUsuarioDTO(
        EstadosUsuario estadosUsuario);

    public EstadosUsuario estadosUsuarioDTOToEstadosUsuario(
        EstadosUsuarioDTO estadosUsuarioDTO);

    public List<EstadosUsuarioDTO> listEstadosUsuarioToListEstadosUsuarioDTO(
        List<EstadosUsuario> estadosUsuarios);

    public List<EstadosUsuario> listEstadosUsuarioDTOToListEstadosUsuario(
        List<EstadosUsuarioDTO> estadosUsuarioDTOs);
}
