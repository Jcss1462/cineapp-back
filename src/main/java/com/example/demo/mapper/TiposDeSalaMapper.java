package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.TiposDeSala;
import com.example.demo.dto.TiposDeSalaDTO;


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
public interface TiposDeSalaMapper {
    public TiposDeSalaDTO tiposDeSalaToTiposDeSalaDTO(TiposDeSala tiposDeSala);

    public TiposDeSala tiposDeSalaDTOToTiposDeSala(
        TiposDeSalaDTO tiposDeSalaDTO);

    public List<TiposDeSalaDTO> listTiposDeSalaToListTiposDeSalaDTO(
        List<TiposDeSala> tiposDeSalas);

    public List<TiposDeSala> listTiposDeSalaDTOToListTiposDeSala(
        List<TiposDeSalaDTO> tiposDeSalaDTOs);
}
