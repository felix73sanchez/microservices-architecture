package net.fsxdev.employeeservice.service.impl;

import lombok.AllArgsConstructor;
import net.fsxdev.employeeservice.dto.APIResponseDto;
import net.fsxdev.employeeservice.dto.DepartamentDto;
import net.fsxdev.employeeservice.dto.EmployeeDto;
import net.fsxdev.employeeservice.entity.Employee;
import net.fsxdev.employeeservice.mapper.EmployeeMapper;
import net.fsxdev.employeeservice.repository.EmployeeRepository;
import net.fsxdev.employeeservice.service.APIClient;
import net.fsxdev.employeeservice.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    //private RestTemplate restTemplate;
//    private WebClient webClient;
    private APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = employeeMapper.toEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toEmployeeDto(savedEmployee);
    }

    @Override
    public APIResponseDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId).orElse(null);

//        ResponseEntity<DepartamentDto> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departaments/"+ employee.getDepartamentCode(), DepartamentDto.class);
//        DepartamentDto departamentDto =responseEntity.getBody();

//        DepartamentDto departamentDto = webClient.get().uri("http://localhost:8080/api/departaments/" + employee.getDepartamentCode()).retrieve().bodyToMono(DepartamentDto.class).block();

        DepartamentDto departamentDto = apiClient.getDepartament(employee.getDepartamentCode());

        EmployeeDto employeeDto = employeeMapper.toEmployeeDto(employee);

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartamentDto(departamentDto);

        return apiResponseDto;
    }


}
