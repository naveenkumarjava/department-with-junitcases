package com.org.tcs.service;

import com.org.tcs.model.Department;
import com.org.tcs.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public void createDepartment(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public List<Department> getAll() {
        List<Department> list  = departmentRepo.findAll();
        return list;
    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public String deleteById(Integer id) {
        departmentRepo.deleteById(id);
        return "success";
    }

    /*@Override
    public String updateAmountBasedOnAddress(String address) {
        departmentRepo.find
        return null;
    }*/


    @Override
    public Optional<Department> getById(Integer id) {
       Optional<Department>department = Optional.of(departmentRepo.getById(id));
        return department;

    }
}
