package Godwin.Bookinging_mgt.ReservationDAO;

import Godwin.Bookinging_mgt.entities.Reservations;
import Godwin.Bookinging_mgt.entities.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IReservationDAO {

    public void save(Reservations user);

    public void findByIdAndDelete(long id);
    public Reservations findById(long id);
    public List<Reservations> findAll();
    public List<Reservations> filterBySurname(String surname);
    Optional<Reservations> FindByReservationTimeAndWorkstationId (LocalDate reservationTime, Long id);
}
