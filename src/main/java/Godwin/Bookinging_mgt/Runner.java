package Godwin.Bookinging_mgt;

import Godwin.Bookinging_mgt.UserDao.IUserDAO;
import Godwin.Bookinging_mgt.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    private IUserDAO userDAO;
    @Override
    public void run(String... args) throws Exception {

        User kade = User.builder().name("Will").email("will@email.com").surname("Smith").build();
        userDAO.save(kade);
    }
}
