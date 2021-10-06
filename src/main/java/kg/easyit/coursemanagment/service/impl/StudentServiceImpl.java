package kg.easyit.coursemanagment.service.impl;

import kg.easyit.coursemanagment.dao.StudentRepository;
import kg.easyit.coursemanagment.entity.Student;
import kg.easyit.coursemanagment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "StudentServiceImplV1")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getOneByID(long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with id:" + id + " not found"));
    }

    @Override
    public void delete(Student type) {

    }
}
