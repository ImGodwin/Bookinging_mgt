package Godwin.Bookinging_mgt.ReservationDAO;

import Godwin.Bookinging_mgt.entities.Reservations;
import Godwin.Bookinging_mgt.entities.User;

import java.util.List;

public interface IReservationDAO {

    public void save(Reservations user);

    public void findByIdAndDelete(long id);
    public Reservations findById(long id);
    public List<Reservations> findAll();
    public List<Reservations> filterBySurname(String surname);
}
