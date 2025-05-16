package net.fsxdev.departamentservice.repository;

import net.fsxdev.departamentservice.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament, Long> {
    Departament findByDepartamentCode(String departamentCode);
}
