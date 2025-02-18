package com.raz.demo.controller;

import com.raz.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return  new Student("Raz","Subedi");
    }

    @GetMapping("/list")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Raz","Subedi"));
        students.add(new Student("Ram","Khatri"));
        students.add(new Student("Hari","Bahadur"));
        students.add(new Student("Messi","Subedi"));
        students.add(new Student("Lionel","Pradhan"));
        return students;
    }

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName){
        return new Student(firstName,lastName);
    }

}
