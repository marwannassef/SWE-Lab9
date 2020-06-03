package com.miu.register.demo.service;

import com.miu.register.demo.model.Student;
import com.miu.register.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getStudent(){
        return studentRepository.findAll();
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    public void deleteStudent(long id){
        studentRepository.deleteById(id);
    }
    public Student getStudent(long id){
       return studentRepository.findById(id).orElse(null);
    }

    public List<Student> searchStudents(String searchWord) {
        return studentRepository.searchStudents(searchWord);
    }

}
