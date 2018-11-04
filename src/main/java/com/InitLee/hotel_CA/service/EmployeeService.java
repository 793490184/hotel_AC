package com.InitLee.hotel_CA.service;

import com.InitLee.hotel_CA.mapper.EmployeeMapper;
import com.InitLee.hotel_CA.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeMapper employeeMapper;


    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public String say() {
        return "hello";
    }
    public List<Employee> getEmps() {
        System.out.println("222");
        return employeeMapper.getEmps();
    }
}
