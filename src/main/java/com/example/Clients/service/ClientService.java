package com.example.Clients.service;

import com.example.Clients.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    public List<Client> findAllStudents() {
        return List.of(
                Client.builder().firstName("Ivan").lastName("Petrov").email("ivanptrv24@gmail.com").age(25).build(),
                Client.builder().firstName("Sergey").lastName("Zagrebin").email("sergza25@gmail.com").age(21).build(),
                Client.builder().firstName("Mihael").lastName("Golubev").email("mishagolub31@gmail.com").age(22).build()
        );
    }
}
