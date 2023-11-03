package Godwin.Bookinging_mgt.UserDao;

import Godwin.Bookinging_mgt.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UsersService implements IUserDAO{

    @Autowired
    private UsersRepository usersRep;
    @Override
    public void save(User user) {
        if(user.getName().length() < 2 ) throw new RuntimeException("Name must be above 2 characters");
        usersRep.save(user);
        System.out.println("User saved");
    }

    @Override
    public void findByIdAndUpdate(long id, User user) {
        User found = this.findById(id);
        found.setName(user.getName());
        found.setSurname(user.getName());
        found.setEmail(user.getEmail());

        usersRep.save(found);
        log.info(id +" saved appropriately");
    }

    @Override
    public void findByIdAndDelete(long id) {

        User found = this.findById(id);
        usersRep.delete(found);
        log.info("this id: " + id + " has been successfully deleted");

    }

    @Override
    public User findById(long id) {
        return usersRep.findById(id).orElseThrow();
    }

    @Override
    public List<User> findAll() {
        return usersRep.findAll();
    }

    @Override
    public List<User> filterBySurname(String surname) {
        return null;
    }

}
