package kg.easyit.coursemanagment.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @Column(name = "firstname", nullable = false)
    String firstName;

    @Column(name = "lastNmae", nullable = false)
    String lastNmae;

    @Column(name = "passport_details", nullable = false, unique = true)
    String passportDetails;

    @Column(name = "age", nullable = false)
    long age;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "phone_number", nullable = false, unique = true)
    String phoneNumber;

    @OneToMany
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    List<Group> group;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
