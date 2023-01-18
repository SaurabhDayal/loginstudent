package com.sts.controller;

import com.sts.entities.Student;
import com.sts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public StudentController() {   }
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/form")
    public String formPage(Model model){
        model.addAttribute("student", new Student());
        return "form";
    }

    @RequestMapping(path="/handleform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("student") Student student){
        System.out.println(student);
        Student student1= studentService.addStudent(student);
        return "success";
    }

    @GetMapping("/student/{studentId}")
    @ResponseBody
    public Student getStudent(@PathVariable String studentId){
        return studentService.getStudentById(Integer.parseInt(studentId));
    }

    @PostMapping("/student")
    @ResponseBody
    public Student success(@RequestBody Student student){
        Student student1= studentService.addStudent(student);
        return student;
    }


}
