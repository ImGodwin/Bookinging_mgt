package Godwin.Bookinging_mgt;

import Godwin.Bookinging_mgt.BuildingDAO.IBuildingDAO;
import Godwin.Bookinging_mgt.ReservationDAO.IReservationDAO;
import Godwin.Bookinging_mgt.UserDao.IUserDAO;
import Godwin.Bookinging_mgt.WorkStationDAO.IWorkStationDAO;
import Godwin.Bookinging_mgt.entities.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    private IUserDAO userDAO;
    @Autowired
    private IBuildingDAO buildingDAO;
    @Autowired
    private IWorkStationDAO workStationDAO;
    @Autowired
    private IReservationDAO reservationDAO;
    @Override
    public void run(String... args) throws Exception {

        try {
            //User
            User kade = User.builder().build();
            //userDAO.save(kade);


            //Building
            Building building = Building.builder().build();
             //buildingDAO.save(building);

            // List<Reservations> reservations1 = Stream.of()


            WorkStation workStation1 = new WorkStation("Finance", Type.MEETING_ROOM, 30);
            //workStationDAO.save(workStation1);


            User user_1 = userDAO.findById(4);
            WorkStation workPost = workStationDAO.findById(5);

            /*Reservations reservation1 = new Reservations(LocalDate.now(), workPost, user_1);
            reservationDAO.save(reservation1);*/

            // Building building = new Building("Bari", "Via fornari 2", "Bari", );



        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }




    }
}
