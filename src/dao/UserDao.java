package dao;

import model.User;
import model.gender.Gender;

import java.util.ArrayList;
import java.util.List;

public class UserDao extends User {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    @Override
    public String toString() {
        return "UserDao{" + users +
                '}';
    }
}
