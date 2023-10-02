package com.pcs.suman.crud.Service;


import com.pcs.suman.crud.model.Student;

public class StudentService {
    public Student GetStudentById(int id){
        //todo: Query from DB and return
        return new Student(id,"abc.gmail.com","addr");
    }
}
