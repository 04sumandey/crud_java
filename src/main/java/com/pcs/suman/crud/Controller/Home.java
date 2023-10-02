package com.pcs.suman.crud.Controller;

import com.pcs.suman.crud.Service.StudentService;
import com.pcs.suman.crud.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Home {
    @GetMapping("/")
    public String Home(){
        System.out.println("Hello Suman");
        return "Home1";
    }
    @GetMapping("/students")
    public Student[] GetStudents(){
        Student[] students= new Student[2];
        students[0]=new Student(1,"abc1@gmail.com","addr1");
        students[1]=new Student(2,"abc2@gmail.com","addr2");

        return students;
    }

    @GetMapping("/students/{id}")
    public Student GetStudentById(@PathVariable int id){
        StudentService service= new StudentService();
        return service.GetStudentById(id);
    }

    @PostMapping("/students")
    public boolean CreateStudent(
            //todo: take JSON input
    ){
        // todo: return true if successfully created otherwise return false
        return false;
    }
}

