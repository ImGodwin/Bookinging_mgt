package Godwin.Bookinging_mgt.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "UserBuilder")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String name;
    private String surname;
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Reservations> reservations;


    public static class UserBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String name = faker.name().firstName();
        private String surname = faker.name().lastName();

        private String email = faker.internet().emailAddress();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReservations(List<Reservations> reservations) {
        this.reservations = reservations;
    }


}
