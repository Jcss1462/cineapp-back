package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosMetodoDePago;
import com.example.demo.dto.EstadosMetodoDePagoDTO;


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
public interface EstadosMetodoDePagoMapper {
    public EstadosMetodoDePagoDTO estadosMetodoDePagoToEstadosMetodoDePagoDTO(
        EstadosMetodoDePago estadosMetodoDePago);

    public EstadosMetodoDePago estadosMetodoDePagoDTOToEstadosMetodoDePago(
        EstadosMetodoDePagoDTO estadosMetodoDePagoDTO);

    public List<EstadosMetodoDePagoDTO> listEstadosMetodoDePagoToListEstadosMetodoDePagoDTO(
        List<EstadosMetodoDePago> estadosMetodoDePagos);

    public List<EstadosMetodoDePago> listEstadosMetodoDePagoDTOToListEstadosMetodoDePago(
        List<EstadosMetodoDePagoDTO> estadosMetodoDePagoDTOs);
}
