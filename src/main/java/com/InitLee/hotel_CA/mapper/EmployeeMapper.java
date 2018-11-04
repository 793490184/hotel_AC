package com.InitLee.hotel_CA.mapper;

import com.InitLee.hotel_CA.model.Employee;

import java.util.List;


public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();


}
