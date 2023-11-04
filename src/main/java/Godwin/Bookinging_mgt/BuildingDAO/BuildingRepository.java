package Godwin.Bookinging_mgt.BuildingDAO;

import Godwin.Bookinging_mgt.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {

}
