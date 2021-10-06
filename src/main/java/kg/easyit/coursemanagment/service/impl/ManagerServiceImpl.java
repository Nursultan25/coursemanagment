package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.ManagerRepository;
import kg.easyit.coursemanagment.entity.Manager;
import kg.easyit.coursemanagment.service.ManagerService;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults()
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public void save(Manager type) {
        managerRepository.save(type);
    }

    @Override
    public Manager getOneByID(long id) {
        return managerRepository.findById(id).orElseThrow(() -> new RuntimeException("Manager not found by id: " + id));
    }

    @Override
    public void delete(Manager type) {
        managerRepository.delete(type);
    }
}
