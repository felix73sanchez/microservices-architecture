package net.fsxdev.departamentservice.service.impl;

import lombok.AllArgsConstructor;
import net.fsxdev.departamentservice.dto.DepartamentDto;
import net.fsxdev.departamentservice.entity.Departament;
import net.fsxdev.departamentservice.mapper.DepartamentMapper;
import net.fsxdev.departamentservice.repository.DepartamentRepository;
import net.fsxdev.departamentservice.service.DepartamentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartamentServiceImpl implements DepartamentService {

    private final DepartamentRepository departamentRepository;
    private final DepartamentMapper departamentMapper;

    @Override
    public DepartamentDto saveDepartament(DepartamentDto departamentDto) {
        Departament departament = departamentMapper.mapToDepartament(departamentDto);
        Departament savedDepartament = departamentRepository.save(departament);
        return departamentMapper.mapToDepartamentDto(savedDepartament);
    }

    @Override
    public DepartamentDto getDepartamentByCode(String departamentCode) {
        Departament departament = departamentRepository.findByDepartamentCode(departamentCode);

        return departamentMapper.mapToDepartamentDto(departament);
    }
}