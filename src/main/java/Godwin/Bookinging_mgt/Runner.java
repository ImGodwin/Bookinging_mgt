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
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        try {
          /*  System.out.println("<<<<<<<<<<<<<<here>>>>>>>>>>>>>>\n");
            System.out.println("Here are the offices available for rent \n");
            System.out.println("<<<<<<<<<<<<<<here>>>>>>>>>>>>>>\n");

            System.out.println("please add date: yy/mm/dd ");


            workStationDAO.findByBookingEntry("FREE").forEach(spot -> System.out.println(spot.toString()));
            System.out.println("type in the type of office from the list: 1. Open Space;  2. Private; 3. Meeting Room");
            int office = Integer.parseInt(input.nextLine());
            workStationDAO.findTypeOfOffice(office == 1 ? Type.OPENSPACE : office == 2 ? Type.PRIVATE : Type.MEETING_ROOM).forEach(selection -> System.out.println(selection.toString()));
            System.out.println("please add date: yyyy/mm/dd ");
            String date = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            System.out.println("add office ID");
            long id = Long.parseLong(input.nextLine());
            Optional<Reservations> r = reservationDAO.FindByReservationTimeAndWorkstationId(LocalDate.parse(date, formatter), id);
            if (r.isEmpty()){
                reservationDAO.save(new Reservations(LocalDate.parse(date, formatter), workStationDAO.findById(id), userDAO.findById(3)));
                System.out.println("saved");
            }
            else {
                System.out.println("date was taken");
            }*/


            System.out.println("type in the type of office from the list: 1. Open Space;  2. Private; 3. Meeting Room");
            int station = Integer.parseInt(input.nextLine());
            System.out.println("name of city");
            String city = input.nextLine();
            workStationDAO.findByTypeAndBuildingCity((station == 1 ? Type.OPENSPACE : station == 2 ?
                    Type.PRIVATE : Type.MEETING_ROOM), city).forEach(selection -> System.out.println(selection.toString()));
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

       /* System.out.println("Want to make a WeWork? Click 1");
        Scanner input = new Scanner(System.in);
        int num = 1;
        //while (num != 0){

            num = Integer.parseInt(input.nextLine());

        try {

            switch (num){
                case 1:
                    try {

                        System.out.println("Enter date: ");

                    }catch (Exception ex){
                        System.err.println(ex.getMessage());
                    }
            }














        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        }*/



    }
}
