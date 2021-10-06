package kg.easyit.coursemanagment.dao;

import kg.easyit.coursemanagment.entity.CourseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {
}
