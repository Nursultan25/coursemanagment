package kg.easyit.coursemanagment.dao;

import kg.easyit.coursemanagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
