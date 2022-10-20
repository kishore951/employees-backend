package com.nestdigital.employeebackend.Controller;

import com.nestdigital.employeebackend.Dao.EmployeeDao;
import com.nestdigital.employeebackend.Model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeDao dao;



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String addEmployee(@RequestBody EmployeeModel employee){
        dao.save(employee);
        return "{{status:'success}}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewEmployee",consumes = "application/json",produces = "application/json")
    public List<EmployeeModel>viewEmployee(){
        return (List<EmployeeModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteEmployee",consumes = "application/json",produces = "application/json")
    public  String deleteEmployee(@RequestBody EmployeeModel employee){
        dao.deleteEmployeeById(employee.getId());
        return "{status:'success}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmployee",consumes = "application/json",produces = "application/json")
    public List<EmployeeModel> searchEmployee(@RequestBody EmployeeModel employee){
        return (List<EmployeeModel>) dao.searchEmployee(employee.getName());
    }
}
