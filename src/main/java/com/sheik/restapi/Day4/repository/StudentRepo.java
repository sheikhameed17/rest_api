package com.sheik.restapi.Day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheik.restapi.Day4.model.StudentModel;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}