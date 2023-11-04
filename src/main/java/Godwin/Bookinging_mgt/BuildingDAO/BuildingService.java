package Godwin.Bookinging_mgt.BuildingDAO;

import Godwin.Bookinging_mgt.entities.Building;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BuildingService implements IBuildingDAO{

    @Autowired
    private BuildingRepository buildingRepo;
    @Override
    public void save(Building building) {

        try {
            if(building.getName().length() < 2) throw new RuntimeException("Il nome è troppo corto");
            buildingRepo.save(building);
            buildingRepo.save(building);
            log.info(building + " saved successfully");
        } catch (Exception ex){
            System.err.println("Building not saved");
        }
    }

    @Override
    public void findByIdAndUpdate(long id, Building building) {
        Building buildingFound = this.findById(id);

        try {
            buildingFound.setName(building.getName());
            buildingFound.setAddress(building.getAddress());
            buildingFound.setCity(building.getCity());

            buildingRepo.save(building);
            log.info("This building: " + building + "has been updated and saved");
        } catch (Exception ex){
            System.err.println("Item not found nor updated");
        }
    }

    @Override
    public void findByIdAndDelete(long id) {
        try {
            Building buildingToDelete = this.findById(id);
            buildingRepo.delete(buildingToDelete);

            System.out.println("Building " + buildingToDelete + " deleted");
        } catch (Exception ex){
            System.err.println("Item not deleted");
        }
    }

    @Override
    public Building findById(long id) {

        //Using optional because this id may or may not be there

        Optional<Building> searchBuildingById = buildingRepo.findById(id);

        return searchBuildingById.orElse(null);
    }

    @Override
    public List<Building> findAll() {
        //when searching for all buildings, a table is returned, and not a single Id
        return buildingRepo.findAll();
    }
}
