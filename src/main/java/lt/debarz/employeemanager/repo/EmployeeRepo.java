package lt.debarz.employeemanager.repo;

import lt.debarz.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(long id);

    Optional<Employee> findEmployeeById(Long id);
}
