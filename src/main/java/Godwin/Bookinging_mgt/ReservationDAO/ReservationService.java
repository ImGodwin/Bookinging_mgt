package Godwin.Bookinging_mgt.ReservationDAO;

import Godwin.Bookinging_mgt.entities.Reservations;
import Godwin.Bookinging_mgt.entities.WorkStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements IReservationDAO{

    @Autowired
    private IReservationREPO reservationREPO;
    @Override
    public void save(Reservations user) {
        try {
            reservationREPO.save(user);
            System.out.println("saved");
        }catch (Exception ex){
            System.err.println("Not Saved");
        }
    }

    @Override
    public void findByIdAndDelete(long id) {

        try {
        Reservations reservation = this.findById(id);
        reservationREPO.delete(reservation);
        } catch (Exception ex){
            System.err.println("Item not deleted from the database");
        }
    }

    @Override
    public Reservations findById(long id) {
        Optional<Reservations> searchForReservation = reservationREPO.findById(id);
        return searchForReservation.orElse(null);
    }

    @Override
    public List<Reservations> findAll() {
        return null;
    }

    @Override
    public List<Reservations> filterBySurname(String surname) {
        return null;
    }
}
