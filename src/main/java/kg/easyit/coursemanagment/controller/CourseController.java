package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course/controller/")
public class CourseController {
    @Autowired
    CourseService courseService;


}
