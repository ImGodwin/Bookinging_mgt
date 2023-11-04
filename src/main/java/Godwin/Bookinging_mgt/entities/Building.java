package Godwin.Bookinging_mgt.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "building")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "BuildingBuilder")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String name;
    private String address;
    private String city;

    @OneToMany(mappedBy = "building")
    private List<WorkStation> workStations;

    public Building(String name, String address, String city, List<WorkStation> workStations) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.workStations = workStations;
    }

      public static class BuildingBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String name = faker.name().firstName();
        private String address = faker.address().fullAddress();
        private String city = faker.address().city();

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWorkStations(List<WorkStation> workStations) {
        this.workStations = workStations;
    }
}
