package Godwin.Bookinging_mgt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservations")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalTime reservationTime;

    @ManyToOne
    @JoinColumn(name = "workStation_id", nullable = false)
    private WorkStation workStation;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setWorkStation(WorkStation workStation) {
        this.workStation = workStation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
