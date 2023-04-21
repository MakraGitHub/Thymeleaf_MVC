package com.makara.StudentThymeleaf.controller;

import com.makara.StudentThymeleaf.Entity.Student;
import com.makara.StudentThymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("studentList",repository.findAll());
        return "home";
    }

    @GetMapping("/saveStudent")
    public String saveStudent(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return"add_student";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student")Student student){
        repository.save(student);
        return "redirect:/";
    }

    @GetMapping("/updateStudents/{id}")
    public String showUpdateStudent(@PathVariable("id") int id, Model model) {
        Optional<Student> temp = repository.findById(id);
        Student student = temp.get();
        model.addAttribute("student",student);
        return "update_student";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id")int id){
        repository.deleteById(id);
        return "redirect:/";
    }

}
