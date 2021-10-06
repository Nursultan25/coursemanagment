package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.CourseRepository;
import kg.easyit.coursemanagment.entity.Course;
import kg.easyit.coursemanagment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public void save(Course type) {
        courseRepository.save(type);
    }

    @Override
    public Course getOneByID(long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("No such Course"));
    }

    @Override
    public void delete(Course type) {
        courseRepository.delete(type);
    }
}
