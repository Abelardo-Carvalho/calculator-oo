package com.mjv.curso.calculatorpoo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {


    private String name;
    private int age;
    private String profession;
    private String cpf;

public User (String name, int age, String profession, String cpf){
    this.setName(name);
    this.setAge(age);
    this.setProfession(profession);
    this.setCpf(cpf);

}


}
