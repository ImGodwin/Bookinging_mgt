package Godwin.Bookinging_mgt.UserDao;

import Godwin.Bookinging_mgt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    //List<User> findByNameAndSurname(String name, String surname);

}
