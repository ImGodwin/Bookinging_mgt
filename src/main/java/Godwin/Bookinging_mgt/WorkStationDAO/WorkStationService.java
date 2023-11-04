package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.Building;
import Godwin.Bookinging_mgt.entities.Type;
import Godwin.Bookinging_mgt.entities.WorkStation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class WorkStationService implements IWorkStationDAO{

    @Autowired
    private IWorkStationRepository workRepo;
    @Override
    public void save(WorkStation workStation) {
        workRepo.save(workStation);
        log.info(workStation + " saved successfully");
    }

    @Override
    public void findByIdAndUpdate(long id, WorkStation workStation) {
       WorkStation workStation1 = this.findById(id);
        workStation1.setDescription(workStation1.getDescription());
        workStation1.setType();
        workStation1.setMaxOccupants(workStation1.getMaxOccupants());
        workRepo.save(workStation1);
        log.info("This building: " + workStation1 + "has been updated and saved");
    }

    @Override
    public void findByIdAndDelete(long id) {
        WorkStation workStation = this.findById(id);
        workRepo.delete(workStation);

        log.info(workStation + " deleted from the database");
    }

    @Override
    public WorkStation findById(long id) {
        Optional<WorkStation> searchForWorkStation = workRepo.findById(id);
         return searchForWorkStation.orElse(null);
    }

    @Override
    public List<WorkStation> findAll() {
        return workRepo.findAll();
    }
}
