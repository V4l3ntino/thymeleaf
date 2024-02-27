package com.thymeleaf.libros.controller.impl;

import com.thymeleaf.libros.controller.ImplementationsController;
import com.thymeleaf.libros.model.entity.Student;
import com.thymeleaf.libros.model.repository.StudentRepository;
import com.thymeleaf.libros.model.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;
    //StudentService orm;
    @GetMapping("students")
    public String getAll(Model model) {
        model.addAttribute("students", studentService.getAllMethod());
        return "index";
    }
    @GetMapping("students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "student/create_student";
    }

    @PostMapping("students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.createMethod(student);
        return "redirect:/students";
    }

    @GetMapping("students/edit/{id}")
    public String editStudentForm(@PathVariable Integer id, Model model){
        model.addAttribute("student", studentService.getMethod(id));
        return "student/edit_student";
    }

    @PostMapping("students/{id}")
    public String updateStudent(@PathVariable Integer id, @ModelAttribute("student")Student student){
        //SACO EL OBJETO DE LA DB
        Student existingStudent = studentService.getMethod(id);
        //MODIFICO ESE OBJETO CON LOS NUEVOS DATOS DEL FORMULARIO
         existingStudent.setId(id);
         existingStudent.setFirstName(student.getFirstName());
         existingStudent.setLastName(student.getLastName());
         existingStudent.setEmail(student.getEmail());

         //GUARDO EL USUARIO MODIFICADO EN LA DB
        studentService.createMethod(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("students/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentService.deleteMethod(id);
        return "redirect:/students";
    }

}
