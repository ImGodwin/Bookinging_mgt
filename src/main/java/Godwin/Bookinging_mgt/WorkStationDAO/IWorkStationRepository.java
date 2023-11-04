package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.WorkStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkStationRepository extends JpaRepository<WorkStation, Long> {
}
