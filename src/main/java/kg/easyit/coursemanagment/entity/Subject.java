package kg.easyit.coursemanagment.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tb_subject")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false,unique = true)
    long id;

    @Column(name = "speciality", nullable = false, unique = true)
    String speciality;
}
