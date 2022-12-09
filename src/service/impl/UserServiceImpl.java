package service.impl;

import dao.UserDao;
import exeption.MyExeption;
import model.User;
import service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public void userAdd(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User idFind(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                return userDao.getUsers().get(i);
            }
        }
        throw new MyExeption("not found");
    }


    @Override
    public void idRemove(int remove) {
        List<User> removeUser = userDao.getUsers();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (removeUser.removeIf(user -> user.getId() == remove)) {

            }

        }
    }


    @Override
    public void userAll() {
        List<User> userList = userDao.getUsers();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
                System.out.println(userList.get(i));
                }

        }
    }




