package Godwin.Bookinging_mgt.ReservationDAO;

import Godwin.Bookinging_mgt.entities.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface IReservationREPO extends JpaRepository<Reservations, Long> {

    @Query("SELECT r FROM Reservations r WHERE r.reservationTime = :date AND r.workStation.id = :workstation_id")
    Optional<Reservations> ReservationTimeAndWorkstationId (LocalDate date, Long workstation_id);
}
