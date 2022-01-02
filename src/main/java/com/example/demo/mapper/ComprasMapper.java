package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.Compras;
import com.example.demo.dto.ComprasDTO;


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
public interface ComprasMapper {
    @Mapping(source = "estadosCompra.idEstado", target = "idEstado_EstadosCompra")
    @Mapping(source = "funciones.idFuncion", target = "idFuncion_Funciones")
    @Mapping(source = "metodosDePago.idMetodo", target = "idMetodo_MetodosDePago")
    @Mapping(source = "usuarios.email", target = "email_Usuarios")
    public ComprasDTO comprasToComprasDTO(Compras compras);

    @Mapping(source = "idEstado_EstadosCompra", target = "estadosCompra.idEstado")
    @Mapping(source = "idFuncion_Funciones", target = "funciones.idFuncion")
    @Mapping(source = "idMetodo_MetodosDePago", target = "metodosDePago.idMetodo")
    @Mapping(source = "email_Usuarios", target = "usuarios.email")
    public Compras comprasDTOToCompras(ComprasDTO comprasDTO);

    public List<ComprasDTO> listComprasToListComprasDTO(List<Compras> comprass);

    public List<Compras> listComprasDTOToListCompras(
        List<ComprasDTO> comprasDTOs);
}
