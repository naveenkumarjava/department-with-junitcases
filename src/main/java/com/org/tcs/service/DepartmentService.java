package com.org.tcs.service;

import com.org.tcs.model.Department;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public void createDepartment(Department department);
    public List<Department> getAll();
    public void updateDepartment(Department department);
    public String deleteById(Integer id);
    public Optional<Department> getById( Integer id);
    /*public String updateAmountBasedOnAddress(String address);*/

}
