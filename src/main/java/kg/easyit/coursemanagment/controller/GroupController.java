package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;

@Controller
public class GroupController {
    @Autowired
    GroupService groupService;


}
