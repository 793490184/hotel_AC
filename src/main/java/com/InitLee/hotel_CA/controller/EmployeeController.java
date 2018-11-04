package com.InitLee.hotel_CA.controller;

import com.InitLee.hotel_CA.model.Employee;
import com.InitLee.hotel_CA.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("/hotel_CA")
public class EmployeeController {

//    @Autowired
//    EmployeeService employeeService = new EmployeeService();

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/emps")
    public void emps(Map<String, Object> map){
        System.out.println("111");
        List<Employee> emps = employeeService.getEmps();
        System.out.println("222");
        System.out.println(emps);
        map.put("allEmps",emps);
        //return "list";

    }

    @Test
    public void test(){
        System.out.println("111");
        System.out.println(employeeService.say());
        //List<Employee> emps = employeeService.getEmps();
        //System.out.println("222");
        //System.out.println(emps);
    }
}
