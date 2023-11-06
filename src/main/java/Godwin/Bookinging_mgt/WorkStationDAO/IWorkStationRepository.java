package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.OfficeBookings;
import Godwin.Bookinging_mgt.entities.Type;
import Godwin.Bookinging_mgt.entities.WorkStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWorkStationRepository extends JpaRepository<WorkStation, Long> {

    //arguably my most difficult bug so far
    List<WorkStation> findByBooking(OfficeBookings booking);

    List<WorkStation> findByTypeAndBooking(Type type, OfficeBookings booking);

    List<WorkStation> findByTypeAndBuildingCity(Type type, String city);
}
