package com.example.Clients.service;

import com.example.Clients.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public interface ClientService {
    List<Client> findAllStudents();
    Client saveClients(Client client);
    Client findByEmail(String email);
    Client updateClient(Client client);
    void deleteClient(String email);
}
