package com.example.ejb_serveur;

import jakarta.ejb.Remote;

@Remote
public interface HelloService {
    String helloWorld();
}