package com.company;

import dao.UserDao;
import exeption.MyExeption;
import model.User;
import model.gender.Gender;
import service.impl.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Bekbolot", 23, Gender.MALE);
        User user2 = new User(2, "Alex", 25, Gender.MALE);
        User user3 = new User(3, "Hunter", 27, Gender.MALE);

        /**
         * USERDAO
         */



        UserServiceImpl userService = new UserServiceImpl();
        userService.userAdd(user1);
        userService.userAdd(user2);
        userService.userAdd(user3);



                try {
                    System.out.println(userService.idFind(2));;
                } catch (MyExeption e) {
                    System.out.println(e.getMessage());
                }
        userService.userAll();
        System.out.println();
        userService.idRemove(2);
        userService.userAll();
        System.out.println();

        userService.userAll();




            }
    }





