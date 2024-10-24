package com.example.ejb_serveur;

import jakarta.ejb.Stateless;

@Stateless
public class HelloServiceBean implements HelloService {

    @Override
    public String helloWorld() {
        return "Hello, World from EJB!";
    }
}