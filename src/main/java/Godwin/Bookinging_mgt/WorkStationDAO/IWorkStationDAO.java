package Godwin.Bookinging_mgt.WorkStationDAO;

import Godwin.Bookinging_mgt.entities.WorkStation;

import java.util.List;

public interface IWorkStationDAO {
    public void save(WorkStation workStation);

    public void findByIdAndUpdate(long id, WorkStation workStation);
    public void findByIdAndDelete(long id);
    public WorkStation findById(long id);
    public List<WorkStation> findAll();
}
