package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.domain.EstadosCompra;
import com.example.demo.dto.EstadosCompraDTO;


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
public interface EstadosCompraMapper {
    public EstadosCompraDTO estadosCompraToEstadosCompraDTO(
        EstadosCompra estadosCompra);

    public EstadosCompra estadosCompraDTOToEstadosCompra(
        EstadosCompraDTO estadosCompraDTO);

    public List<EstadosCompraDTO> listEstadosCompraToListEstadosCompraDTO(
        List<EstadosCompra> estadosCompras);

    public List<EstadosCompra> listEstadosCompraDTOToListEstadosCompra(
        List<EstadosCompraDTO> estadosCompraDTOs);
}
