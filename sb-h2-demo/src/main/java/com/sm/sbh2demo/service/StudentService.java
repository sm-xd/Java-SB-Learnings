package com.sm.sbh2demo.service;

import com.sm.sbh2demo.model.Student;
import com.sm.sbh2demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }



    public void addStudent(Student s) {

        repo.save(s);
    }

    public List<Student> getStudents() {

        return repo.findAll();
    }



}
