package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.MetodosDePago;
import com.example.demo.dto.MetodosDePagoDTO;


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
public interface MetodosDePagoMapper {
    @Mapping(source = "estadosMetodoDePago.idEstado", target = "idEstado_EstadosMetodoDePago")
    @Mapping(source = "usuarios.email", target = "email_Usuarios")
    public MetodosDePagoDTO metodosDePagoToMetodosDePagoDTO(
        MetodosDePago metodosDePago);

    @Mapping(source = "idEstado_EstadosMetodoDePago", target = "estadosMetodoDePago.idEstado")
    @Mapping(source = "email_Usuarios", target = "usuarios.email")
    public MetodosDePago metodosDePagoDTOToMetodosDePago(
        MetodosDePagoDTO metodosDePagoDTO);

    public List<MetodosDePagoDTO> listMetodosDePagoToListMetodosDePagoDTO(
        List<MetodosDePago> metodosDePagos);

    public List<MetodosDePago> listMetodosDePagoDTOToListMetodosDePago(
        List<MetodosDePagoDTO> metodosDePagoDTOs);
}
