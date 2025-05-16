package net.fsxdev.employeeservice.service;

import net.fsxdev.employeeservice.dto.DepartamentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTAMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/departaments/{departament-code}")
    DepartamentDto getDepartament(@PathVariable("departament-code") String departamentCode);


}
