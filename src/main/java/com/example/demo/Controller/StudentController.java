package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

@Autowired(required=true)
StudentService stuService;

@PostMapping("/addDetails")
public StudentEntity addInfo(@RequestBody StudentEntity st) {
return stuService.saveDetails(st);
}
}