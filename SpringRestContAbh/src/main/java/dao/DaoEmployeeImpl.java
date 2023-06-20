package dao;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DaoEmployeeImpl implements DaoEmployee{
    private List<Employee> employees = new ArrayList<> ();

    @Override
    public boolean registerEmployee(Employee employee) {
        return employees.add(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        int index = employees.indexOf(employee);
        if (index != -1) {
            employees.set(index, employee);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        return employees.remove(employee);
    }

    @Override
    public Employee getEmployee(Employee employee) {
        int index = employees.indexOf(employee);
        if (index != -1) {
            return employees.get(index);
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employees;
    }
}
