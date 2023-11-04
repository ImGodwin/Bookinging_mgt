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
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    private LocalDate reservationTime;

    @ManyToOne
    @JoinColumn(name = "workStation_id", nullable = false)
    private WorkStation workStation;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Reservations(LocalDate reservationTime, WorkStation workStation, User user) {
        this.reservationTime = reservationTime;
        this.workStation = workStation;
        this.user = user;
    }

    public void setReservationTime(LocalDate reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setWorkStation(WorkStation workStation) {
        this.workStation = workStation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
