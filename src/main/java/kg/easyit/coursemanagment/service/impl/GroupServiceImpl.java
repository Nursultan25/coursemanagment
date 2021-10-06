package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.GroupRepository;
import kg.easyit.coursemanagment.entity.Group;
import kg.easyit.coursemanagment.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public void save(Group type) {
        groupRepository.save(type);
    }

    @Override
    public Group getOneByID(long id) {
        return groupRepository.findById(id).orElseThrow(() -> new RuntimeException("Group not found by id: " + id));
    }

    @Override
    public void delete(Group type) {
        groupRepository.delete(type);
    }
}
