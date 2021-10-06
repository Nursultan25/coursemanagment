package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.UserRepository;
import kg.easyit.coursemanagment.entity.User;
import kg.easyit.coursemanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userServiceImplV1")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getOneByID(long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void delete(User type) {

    }
}
