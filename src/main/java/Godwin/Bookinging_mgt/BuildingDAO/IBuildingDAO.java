package Godwin.Bookinging_mgt.BuildingDAO;

import Godwin.Bookinging_mgt.entities.Building;

import java.util.List;

public interface IBuildingDAO {
    public void save(Building building);

    public void findByIdAndUpdate(long id, Building building);
    public void findByIdAndDelete(long id);
    public Building findById(long id);
    public List<Building> findAll();
}
