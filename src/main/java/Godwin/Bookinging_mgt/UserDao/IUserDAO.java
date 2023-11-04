package Godwin.Bookinging_mgt.UserDao;

import Godwin.Bookinging_mgt.entities.User;

import java.util.List;

public interface IUserDAO {

    public void save(User user);

    public void findByIdAndUpdate(long id, User user) throws Exception;
    public void findByIdAndDelete(long id) throws Exception;
    public User findById(long id) throws Exception;
    public List<User> findAll();
    public List<User> filterBySurname(String surname);


}
