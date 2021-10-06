package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.entity.Student;
import kg.easyit.coursemanagment.service.StudentService;
import kg.easyit.coursemanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @Autowired
    @Qualifier(value = "StudentServiceImplV1")
    private StudentService studentService;

    @RequestMapping("/save-student")
    public void save() {
        System.out.println("Student info has been saved");
    }

    public Student getOneById(long id){
       return studentService.getOneByID(id);
    }
}
