package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentEntity;

import com.example.demo.Repository.StudentRepo;

@Service

public class StudentService

{

@Autowired(required=true)

StudentRepo stRepo;

public StudentEntity saveDetails(StudentEntity e)

{

return stRepo.save(e);

}

} 