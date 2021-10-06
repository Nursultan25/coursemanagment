package kg.easyit.coursemanagment.entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_course")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    Long id;
    @Column(name = "name", nullable = false, unique = true)
    String name;
    @Column(name = "date_start", nullable = false)
    Date date_start;
    @Column(name = "date_end", nullable = false)
    Date date_end;
    @ManyToOne
    CourseType courseType;
    @OneToOne
    Subject subject;
    @Column(name = "price", nullable = false)
    Long price;
    @Column(name = "duration", nullable = false)
    String duration;
}
