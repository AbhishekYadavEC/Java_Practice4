package dao;

import model.Employee;

import java.util.List;

public interface DaoEmployee {
    boolean registerEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
