package kg.easyit.coursemanagment.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Table(name = "tb_course_type")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    long id;

    @Column(name = "type" , nullable = false, unique = true)
    String type;

    @Column(name = "frequency", nullable = false)
    String frequency;
}
