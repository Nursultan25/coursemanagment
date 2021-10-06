package kg.easyit.coursemanagment.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tb_manager")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    long id;
    @Column(name = "first_name", nullable = false)
    String firstname;
    @Column(name = "last_name", nullable = false)
    String lastname;
    @Column(name = "age", nullable = false)
    long age;
    @Column(name = "passport_details", nullable = false, unique = true)
    String passportDetails;
    @Column(name = "email", nullable = false, unique = true)
    String email;
    @Column(name = "phone_number", nullable = false, unique = true)
    String phoneNumber;
}
