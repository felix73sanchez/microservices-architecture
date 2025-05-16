package net.fsxdev.employeeservice.service;

import net.fsxdev.employeeservice.dto.APIResponseDto;
import net.fsxdev.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
