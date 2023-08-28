package com.sheik.restapi.Day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheik.restapi.Day6.model.ChildrenModel;

@Repository
public interface ChildrenRepo extends JpaRepository<ChildrenModel, Integer>{

}