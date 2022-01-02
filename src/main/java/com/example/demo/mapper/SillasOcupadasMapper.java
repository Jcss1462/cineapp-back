package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.SillasOcupadas;
import com.example.demo.dto.SillasOcupadasDTO;


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
public interface SillasOcupadasMapper {
    @Mapping(source = "compras.idCompra", target = "idCompra_Compras")
    @Mapping(source = "sillas.idSilla", target = "idSilla_Sillas")
    public SillasOcupadasDTO sillasOcupadasToSillasOcupadasDTO(
        SillasOcupadas sillasOcupadas);

    @Mapping(source = "idCompra_Compras", target = "compras.idCompra")
    @Mapping(source = "idSilla_Sillas", target = "sillas.idSilla")
    public SillasOcupadas sillasOcupadasDTOToSillasOcupadas(
        SillasOcupadasDTO sillasOcupadasDTO);

    public List<SillasOcupadasDTO> listSillasOcupadasToListSillasOcupadasDTO(
        List<SillasOcupadas> sillasOcupadass);

    public List<SillasOcupadas> listSillasOcupadasDTOToListSillasOcupadas(
        List<SillasOcupadasDTO> sillasOcupadasDTOs);
}
