package com.sheik.restapi.Day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheik.restapi.Day5.model.BookModel;



public interface BookRepository extends JpaRepository<BookModel,Integer>{



	boolean existsById(int id);



}