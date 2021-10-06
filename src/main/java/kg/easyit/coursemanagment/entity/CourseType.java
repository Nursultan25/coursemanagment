package kg.easyit.coursemanagment.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
