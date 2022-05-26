package com.romanderevyago.spring.springboot.springboot_rest.service;



import com.romanderevyago.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees ();


    public Employee getEmployee (int id);

    public void deleteEmployee (int id);

     public void saveEmployee(Employee employee);
}

