package kg.easyit.coursemanagment.controller;

import kg.easyit.coursemanagment.entity.User;
import kg.easyit.coursemanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Time;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    @Qualifier(value = "userServiceImplV1")
    private UserService userService;

    @RequestMapping("/save")
    public void save() {
        User user = new User();
        user.setId(1L);
        user.setUserName("John");
        user.setFirstName("John");
        user.setLastName("John");
        user.setDateCreated(new Date());
        user.setDateUpdated(new Date());
        user.setPassword("John");
        userService.save(user);
    }

    @RequestMapping("/")
    public User getOneByID(long id) {
        return userService.getOneByID(id);
    }
}
