package com.mjv.curso.calculatorpoo.model;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> users = new ArrayList<>();

    public void regUser(String name, int age, String profession, String cpf){
        User newUser = new User(name,age,profession,cpf);
        users.add(newUser);

    }
}
