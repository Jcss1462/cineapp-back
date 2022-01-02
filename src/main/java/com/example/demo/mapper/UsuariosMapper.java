package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Usuarios;
import com.example.demo.dto.UsuariosDTO;


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
public interface UsuariosMapper {
    @Mapping(source = "estadosUsuario.idEstado", target = "idEstado_EstadosUsuario")
    @Mapping(source = "tiposUsuario.idTipo", target = "idTipo_TiposUsuario")
    public UsuariosDTO usuariosToUsuariosDTO(Usuarios usuarios);

    @Mapping(source = "idEstado_EstadosUsuario", target = "estadosUsuario.idEstado")
    @Mapping(source = "idTipo_TiposUsuario", target = "tiposUsuario.idTipo")
    public Usuarios usuariosDTOToUsuarios(UsuariosDTO usuariosDTO);

    public List<UsuariosDTO> listUsuariosToListUsuariosDTO(
        List<Usuarios> usuarioss);

    public List<Usuarios> listUsuariosDTOToListUsuarios(
        List<UsuariosDTO> usuariosDTOs);
}
