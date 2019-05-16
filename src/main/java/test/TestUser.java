/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDao;
import models.User;

/**
 *
 * @author asus
 */
public class TestUser {
    public static void main(String args[]) {
    
        User user = new User("Edgarin", "Edgar", "Lopez", "1234");

        if (!UserDao.add(user)) {
            System.out.println("no se puedo insertar");
        } else {
            System.out.println("Query Ok");
        }

    }

    @Override
    public String toString() {
        return "Pruebass{" + '}';
    }
}
