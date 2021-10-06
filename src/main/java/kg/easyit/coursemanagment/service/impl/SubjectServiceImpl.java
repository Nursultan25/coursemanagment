package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.SubjectRepository;
import kg.easyit.coursemanagment.entity.Subject;
import kg.easyit.coursemanagment.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public void save(Subject type) {
        subjectRepository.save(type);
    }

    @Override
    public Subject getOneByID(long id) {
        return subjectRepository.findById(id).orElseThrow(() -> new RuntimeException("No such a subject as: " + id));
    }

    @Override
    public void delete(Subject type) {
        subjectRepository.delete(type);
    }
}
