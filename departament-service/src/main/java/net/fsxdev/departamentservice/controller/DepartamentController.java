package net.fsxdev.departamentservice.controller;

import lombok.AllArgsConstructor;
import net.fsxdev.departamentservice.dto.DepartamentDto;
import net.fsxdev.departamentservice.service.DepartamentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departaments")
@AllArgsConstructor
public class DepartamentController {

    private DepartamentService departamentService;

    @PostMapping
    public ResponseEntity<DepartamentDto> saveDepartament(@RequestBody DepartamentDto departamentDto) {
       DepartamentDto saveDepartament =  departamentService.saveDepartament(departamentDto);

       return new ResponseEntity<>(saveDepartament, HttpStatus.CREATED);
    }

    @GetMapping("{departament-code}")
    public ResponseEntity<DepartamentDto> getDepartament(@PathVariable("departament-code") String departamentCode){
       DepartamentDto departamentDto = departamentService.getDepartamentByCode(departamentCode);
       return new ResponseEntity<>(departamentDto, HttpStatus.OK);
    }
}
