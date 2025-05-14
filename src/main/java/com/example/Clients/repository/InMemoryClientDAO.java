package com.example.Clients.repository;

import com.example.Clients.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryClientDAO {
    private final List<Client> CLIENTS = new ArrayList<>(); // Константный список

    public List<Client> findAllStudents() {
        return CLIENTS;
    }


    public Client saveClients(Client client) {
        CLIENTS.add(client);
        return client;
    }


    public Client findByEmail(String email) {
        // проходим по всему массиву
        // если совпадает с нашим email-запросом, то вернем Client
        return CLIENTS.stream().filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public Client updateClient(Client client) {
        var clientIndex = IntStream.range(0, CLIENTS.size())
                .filter(index -> CLIENTS.get(index).getEmail().equals(client.getEmail()))
                .findFirst()
                .orElse(-1);
        if (clientIndex > -1) { // т.е. совпадение было обнаружено
            CLIENTS.set(clientIndex, client);
            return client;
        }

        return null;

    }


    public void deleteClient(String email) {
        var client = findByEmail(email);
        if (client != null) {
            CLIENTS.remove(client);
        }

    }
}
