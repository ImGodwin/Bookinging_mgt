package Godwin.Bookinging_mgt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "user")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String name;
    private String surname;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Reservations> reservations;

    @OneToMany(mappedBy = "user")
    private List<WorkStation> workStations;


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

    public void setWorkStations(List<WorkStation> workStations) {
        this.workStations = workStations;
    }
}
