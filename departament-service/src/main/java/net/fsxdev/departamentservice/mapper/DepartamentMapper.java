package net.fsxdev.departamentservice.mapper;

import net.fsxdev.departamentservice.dto.DepartamentDto;
import net.fsxdev.departamentservice.entity.Departament;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DepartamentMapper {

 DepartamentMapper INSTANCE = Mappers.getMapper(DepartamentMapper.class);

        DepartamentDto mapToDepartamentDto(Departament departament);
        Departament mapToDepartament(DepartamentDto departamentDto);
 }
