package kg.easyit.coursemanagment.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @Column(name = "create_date", nullable = false)
    Date dateCreated;

    @Column(name = "date_updated")
    Date dateUpdated;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "user_name", nullable = false, unique = true)
    String userName;

    @Column(name = "password", nullable = false)
    String password;

    @OneToOne
    Manager manager;
    @OneToOne
    Mentor mentor;
    @OneToOne
    Student student;
}
