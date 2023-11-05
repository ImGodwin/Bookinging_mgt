package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.OfficeBookings;
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
        try {
        workRepo.save(workStation);

        log.info(workStation + " saved successfully");
        } catch (Exception ex){
            System.out.println("Work Station not Saved");
        }
    }

    @Override
    public void findByIdAndUpdate(long id, WorkStation workStation) {
        WorkStation workStation1 = this.findById(id);
        try {
            workStation1.setDescription(workStation1.getDescription());
            workStation1.setType();
            workStation1.setMaxOccupants(workStation1.getMaxOccupants());
            workRepo.save(workStation1);
            log.info("This building: " + workStation1 + "has been updated and saved");
        } catch (Exception ex){
            System.err.println("Item was not found nor updated");
        }
    }

    @Override
    public void findByIdAndDelete(long id) {

        try {
            WorkStation workStation = this.findById(id);
            workRepo.delete(workStation);
            System.out.println(workStation + " deleted from the database");
        }catch (Exception ex){
            System.err.println("Item not deleted from the database");
        }
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

    @Override
    public List<WorkStation> findByBookingEntry(String name) {
        return workRepo.findByBooking(OfficeBookings.FREE);
    }

}
