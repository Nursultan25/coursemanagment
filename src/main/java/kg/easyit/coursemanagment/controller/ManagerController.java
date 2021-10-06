package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.entity.Manager;
import kg.easyit.coursemanagment.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController{

    @Autowired
    ManagerService managerService;

    @RequestMapping("")
    void save() {

    }
    
    Manager getById() {
        return new Manager();
    }

    void delete() {

    }
}
