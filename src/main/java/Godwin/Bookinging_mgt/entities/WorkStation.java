package Godwin.Bookinging_mgt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "work_station")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WorkStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    private long maxOccupants;

    @OneToMany(mappedBy = "workStation")
    private List<Reservations> reservations;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(Type type) {
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

    public void setUser(User user) {
        this.user = user;
    }
}
