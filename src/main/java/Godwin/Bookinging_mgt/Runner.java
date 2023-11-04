package Godwin.Bookinging_mgt;

import Godwin.Bookinging_mgt.BuildingDAO.IBuildingDAO;
import Godwin.Bookinging_mgt.UserDao.IUserDAO;
import Godwin.Bookinging_mgt.entities.Building;
import Godwin.Bookinging_mgt.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    private IUserDAO userDAO;
    private IBuildingDAO buildingDAO;
    @Override
    public void run(String... args) throws Exception {

        User kade = User.builder().build();
        userDAO.save(kade);

       /* Building building = Building.builder().address("Via fornari 2").name("Building A").city("Bari").build();
        buildingDAO.save(building);*/

        //Building building = new Building("Bari", "Via fornari 2", "Bari");





    }
}
