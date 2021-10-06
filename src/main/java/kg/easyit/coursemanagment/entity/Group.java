package kg.easyit.coursemanagment.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_group")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    long id;
    @Column(name = "name", nullable = false, unique = true)
    String name;
    @Column(name = "student_id", nullable = false, unique = true)
    long student_id;
    @ManyToOne
    Course course;
    @ManyToOne
    Mentor mentor;
    @Column(name = "start_time", nullable = false)
    LocalTime start_time;
    @Column(name = "end_time", nullable = false)
    LocalTime end_time;
}
