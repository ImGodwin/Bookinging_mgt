package Godwin.Bookinging_mgt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private Type type;
    private long maxOccupants;





}
