package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SubjectController {
    @Autowired
    SubjectService subjectService;
}
