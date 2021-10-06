package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.MentorRepository;
import kg.easyit.coursemanagment.entity.Mentor;
import kg.easyit.coursemanagment.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorServiceImpl implements MentorService {
    @Autowired
    MentorRepository mentorRepository;

    @Override
    public void save(Mentor type) {
        mentorRepository.save(type);
    }

    @Override
    public Mentor getOneByID(long id) {
        return mentorRepository.findById(id).orElseThrow(() -> new RuntimeException("No such a mentor as:" + id));
    }

    @Override
    public void delete(Mentor type) {
        mentorRepository.delete(type);
    }
}
