package com.romanderevyago.spring.springboot.springboot_rest.dao;



import com.romanderevyago.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployees(int id);

     public void deleteEmployee(int id);
}
