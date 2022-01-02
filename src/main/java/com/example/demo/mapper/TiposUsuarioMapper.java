package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.TiposUsuario;
import com.example.demo.dto.TiposUsuarioDTO;


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
public interface TiposUsuarioMapper {
    public TiposUsuarioDTO tiposUsuarioToTiposUsuarioDTO(
        TiposUsuario tiposUsuario);

    public TiposUsuario tiposUsuarioDTOToTiposUsuario(
        TiposUsuarioDTO tiposUsuarioDTO);

    public List<TiposUsuarioDTO> listTiposUsuarioToListTiposUsuarioDTO(
        List<TiposUsuario> tiposUsuarios);

    public List<TiposUsuario> listTiposUsuarioDTOToListTiposUsuario(
        List<TiposUsuarioDTO> tiposUsuarioDTOs);
}
