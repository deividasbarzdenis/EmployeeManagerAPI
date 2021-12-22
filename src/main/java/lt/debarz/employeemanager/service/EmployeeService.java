package lt.debarz.employeemanager.service;

import lombok.AllArgsConstructor;
import lt.debarz.employeemanager.exception.UserNotFoundException;
import lt.debarz.employeemanager.model.Employee;
import lt.debarz.employeemanager.repo.EmployeeRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    @Transactional
    public void deleteEmployee(long id){
        if (!employeeRepo.existsById(id)) {
            throw new UserNotFoundException("Employee not found");
        }
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
}
