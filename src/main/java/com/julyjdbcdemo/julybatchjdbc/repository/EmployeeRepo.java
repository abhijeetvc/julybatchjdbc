package com.julyjdbcdemo.julybatchjdbc.repository;

import com.julyjdbcdemo.julybatchjdbc.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepo {

    List<Employee> getEmployees();

    Employee getEmployee(Integer id);

    String saveEmployee(Employee employee);

    String updateEmployee(Integer id,String name);


    List<Map<String,Object>> getCombinedData();
}
