package kg.easyit.coursemanagment.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_mentor")
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    Long id;
    @Column(name = "first_name", nullable = false)
    String firstName;
    @Column(name = "last_name", nullable = false)
    String lastName;
    @Column(name = "passport_details", nullable = false, unique = true)
    String passportDetails;
    @Column(name = "age", nullable = false)
    long age;
    @Column(name = "email", nullable = false, unique = true)
    String email;
    @Column(name = "phone_number", nullable = false, unique = true)
    String phoneNumber;
    @OneToMany
    List<Group> groups;
    @OneToOne
    User user;
}
