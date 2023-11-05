package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.OfficeBookings;
import Godwin.Bookinging_mgt.entities.WorkStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWorkStationRepository extends JpaRepository<WorkStation, Long> {

    List<WorkStation> findByBooking(@Param("type") OfficeBookings type);
}
