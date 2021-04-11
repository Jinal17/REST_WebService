package com.swe645.service;

import com.swe645.entity.Student;
import com.swe645.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name) {
        return repository.findByName(name);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed !! " + id;
    }

    public Student updateStudent(Student student) {
        Student existingProduct = repository.findById(student.getId()).orElse(null);
        existingProduct.setStudentId(student.getStudentId());
        existingProduct.setName(student.getName());
        existingProduct.setAddress(student.getAddress());
        existingProduct.setCity(student.getCity());
        existingProduct.setState(student.getState());
        existingProduct.setZip(student.getZip());
        existingProduct.setPhoneNum(student.getPhoneNum());

        existingProduct.setEmail(student.getEmail());
        existingProduct.setGradMonth(student.getGradMonth());
        existingProduct.setGradYear(student.getGradYear());

        existingProduct.setLikes(student.getLikes());
        existingProduct.setInterests(student.getInterests());
        existingProduct.setComments(student.getComments());
        existingProduct.setRecommendation(student.getRecommendation());
        return repository.save(existingProduct);
    }


}
