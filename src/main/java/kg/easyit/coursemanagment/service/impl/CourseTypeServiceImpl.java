package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.CourseTypeRepository;
import kg.easyit.coursemanagment.entity.Course;
import kg.easyit.coursemanagment.entity.CourseType;
import kg.easyit.coursemanagment.service.CourseService;
import kg.easyit.coursemanagment.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {
    @Autowired
    CourseTypeRepository courseTypeRepository;


    @Override
    public void save(CourseType type) {
        courseTypeRepository.save(type);
    }

    @Override
    public CourseType getOneByID(long id) {
        return courseTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("No such Course type"));
    }

    @Override
    public void delete(CourseType type) {
        courseTypeRepository.delete(type);
    }
}
