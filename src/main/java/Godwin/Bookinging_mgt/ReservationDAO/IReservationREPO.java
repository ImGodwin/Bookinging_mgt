package Godwin.Bookinging_mgt.ReservationDAO;

import Godwin.Bookinging_mgt.entities.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationREPO extends JpaRepository<Reservations, Long> {
}
