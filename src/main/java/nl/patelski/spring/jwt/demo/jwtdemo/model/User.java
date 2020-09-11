package nl.patelski.spring.jwt.demo.jwtdemo.model;

import lombok.Data;

@Data
public class User {

    private String user;
    private String pwd;
    private String token;
}
