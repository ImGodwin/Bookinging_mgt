package Godwin.Bookinging_mgt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "work_station")
@Getter
@ToString
@NoArgsConstructor
public class WorkStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private OfficeBookings booking;
    private long maxOccupants;
    private LocalDate localDate;

    @OneToMany(mappedBy = "workStation", fetch = FetchType.EAGER)
    private List<Reservations> reservations;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    public WorkStation(String description, Type type, OfficeBookings booking, long maxOccupants, LocalDate localDate) {
        this.description = description;
        this.type = type;
        this.booking = booking;
        this.maxOccupants = maxOccupants;
        this.localDate = localDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType() {
        this.type = type;
    }

    public void setMaxOccupants(long maxOccupants) {
        this.maxOccupants = maxOccupants;
    }

    public void setReservations(List<Reservations> reservations) {
        this.reservations = reservations;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }


}
