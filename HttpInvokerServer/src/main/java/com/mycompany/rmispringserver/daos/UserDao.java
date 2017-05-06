/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmispringserver.daos;

import com.mycompany.rmispringserver.entities.User;

/**
 *
 * @author shibo
 */
public class UserDao implements Dao {

    @Override
    public double getSalary(User u) {

        return u.getSalary() + .1 * u.getSalary();
    }

}
