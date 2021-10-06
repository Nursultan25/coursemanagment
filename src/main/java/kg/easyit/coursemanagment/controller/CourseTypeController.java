package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CourseTypeController {
    @Autowired
    CourseTypeService courseTypeService;


}
