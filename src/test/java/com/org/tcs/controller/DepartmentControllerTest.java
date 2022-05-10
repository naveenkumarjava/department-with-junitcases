package com.org.tcs.controller;

import com.org.tcs.model.Department;
import com.org.tcs.service.DepartmentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentControllerTest {
@InjectMocks
private DepartmentController departmentController;
@Mock
private DepartmentService departmentService;

    @Test
    void createDepartment() {
        Department department = new Department();
        department.setId(100);
        department.setName("naveen");
        department.setAddress("vza");
        departmentController.createDepartment(department);
        Mockito.verify(departmentService,Mockito.times(1)).createDepartment(department);

    }

    @Test
    void getAll() {
        List<Department> list = new ArrayList<>();
        Department department = new Department();
        department.setId(100);
        department.setName("naveen");
        department.setAddress("hyd");
        list.add(department);
        Department department1 = new Department();
        department1.setId(101);
        department1.setName("naveen");
        department1.setAddress("hyd");
        list.add(department1);
        Mockito.when(departmentService.getAll()).thenReturn(list);
        List<Department> list1=departmentController.getAll();
        Assertions.assertEquals(list.size(),list1.size());

    }

    @Test
    void updateDepartment() {
        Department department = new Department();
        department.setId(100);
        department.setName("naveen");
        department.setAddress("vza");
        departmentController.updateDepartment(department);
        Mockito.verify(departmentService,Mockito.times(1)).updateDepartment(department);


    }

    @Test
    void deleteById() {
        int id=100;
        String value= "naveen";
        String value2=departmentController.deleteById(id);
        Assertions.assertEquals(value,value2);


    }
    @Test
    void getById(){
        int id=100;
        Department department= new Department();
        department.setId(100);
        department.setName("naveen");
        department.setAddress("hyd");
        Optional<Department> optional=Optional.of(department);
        Mockito.when(departmentService.getById(id)).thenReturn(Optional.of(department));
        Optional<Department> optional1 = departmentController.getById(id);
        Assertions.assertEquals(optional,optional1);
    }
}