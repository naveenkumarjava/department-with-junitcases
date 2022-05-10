package com.org.tcs.repository;

import com.org.tcs.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {



}
