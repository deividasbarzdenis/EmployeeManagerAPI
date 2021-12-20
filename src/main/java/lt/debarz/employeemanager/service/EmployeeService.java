package lt.debarz.employeemanager.service;

import lombok.AllArgsConstructor;
import lt.debarz.employeemanager.model.Employee;
import lt.debarz.employeemanager.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
}
