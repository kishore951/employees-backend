package com.nestdigital.employeebackend.Dao;

import com.nestdigital.employeebackend.Model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employees` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployeeById(Integer id);


    @Query(value = "SELECT `id`, `address`, `company`, `date_of_joining`, `designation`, `dob`, `employee_code`, `experiance`, `name`, `salary` FROM `employees` WHERE `name`=:name",nativeQuery = true)
    List<EmployeeModel> searchEmployee(String name);
}
