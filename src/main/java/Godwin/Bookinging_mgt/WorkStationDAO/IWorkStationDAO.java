package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.OfficeBookings;
import Godwin.Bookinging_mgt.entities.Type;
import Godwin.Bookinging_mgt.entities.WorkStation;

import java.util.List;

public interface IWorkStationDAO {
    public void save(WorkStation workStation);

    public void findByIdAndUpdate(long id, WorkStation workStation);
    public void findByIdAndDelete(long id);
    public WorkStation findById(long id);
    public List<WorkStation> findAll();
    public List<WorkStation> findByBookingEntry(String booking);
    public List<WorkStation> findTypeOfOffice(Type type);
}
