package Godwin.Bookinging_mgt.UserDao;

import Godwin.Bookinging_mgt.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.antlr.v4.runtime.misc.NotNull;
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

        try {
            if(user.getName().length() < 2 ) throw new RuntimeException("Name must be above 2 characters");
            usersRep.save(user);
            System.out.println(" saved");
        } catch (Exception ex){
            System.err.println("User not saved");
        }
    }

    @Override
    public void findByIdAndUpdate(long id, @NotNull User user) {
        User found = this.findById(id);

        try {
            found.setName(user.getName());
            found.setSurname(user.getName());
            found.setEmail(user.getEmail());
            usersRep.save(found);
            log.info(id +" saved appropriately");
        } catch (Exception ex){
            System.err.println("Item not updated");
        }
    }

    @Override
    public void findByIdAndDelete(long id) {

        User found = this.findById(id);
        try {
            usersRep.delete(found);
            log.info("this id: " + id + " has been successfully deleted");
        } catch (Exception ex){
            System.out.println("Item not deleted");
        }
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
