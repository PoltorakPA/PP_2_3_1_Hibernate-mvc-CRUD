package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(User deleteUser);


}
