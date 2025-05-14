package com.example.Clients.service.impl;

import com.example.Clients.model.Client;
import com.example.Clients.repository.InMemoryClientDAO;
import com.example.Clients.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor // внедрение Компонента через конструктор (который даже не нужно писать)
public class InMemoryClientServiceImpl implements ClientService {
    
    // Service использует Repository (2-ой уровень пользуется 3-им)
    private final InMemoryClientDAO repository;

    public List<Client> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Client saveClients(Client client) {
        return repository.saveClients(client);
    }

    @Override
    public Client findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Client updateClient(Client client) {
        return repository.updateClient(client);
    }

    @Override
    public void deleteClient(String email) {
        repository.deleteClient(email);
    }
}

