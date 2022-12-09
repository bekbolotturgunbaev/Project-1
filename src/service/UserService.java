package service;

import model.User;

public interface UserService {
    void userAdd(User user);
    User idFind(int id);
    void idRemove(int remove);
    void userAll();
}
