package com.mapping.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.jpa.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}