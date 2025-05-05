package com.example.Clients.controller;

import com.example.Clients.model.Client;
import com.example.Clients.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@AllArgsConstructor 
public class ClientController {

    @NonNull
    private ClientService service = new ClientService();

    @GetMapping
    public List<Client> findAllStudents() {
        return service.findAllStudents();
    }
}
