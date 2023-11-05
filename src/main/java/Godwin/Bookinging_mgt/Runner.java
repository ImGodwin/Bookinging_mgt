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


        try {
            System.out.println("<<<<<<<<<<<<<<here>>>>>>>>>>>>>>\n");
            System.out.println("Here are the offices available for rent \n");
            System.out.println("<<<<<<<<<<<<<<here>>>>>>>>>>>>>>\n");

            System.out.println("please add date: yy/mm/dd ");
            Scanner input = new Scanner(System.in);

            workStationDAO.findByBookingEntry("FREE").forEach(spot -> System.out.println(spot.toString()));
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
