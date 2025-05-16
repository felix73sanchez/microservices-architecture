package net.fsxdev.departamentservice.service;

import net.fsxdev.departamentservice.dto.DepartamentDto;

public interface DepartamentService {
    DepartamentDto saveDepartament(DepartamentDto departamentDto);
    DepartamentDto getDepartamentByCode(String departamentCode);
    //DepartamentDto getAllDepartaments();
}
