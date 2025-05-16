package net.fsxdev.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentDto {
    private Long id;
    private String departamentName;
    private String departamentDescription;
    private String departamentCode;

}
