package com.example.Clients.controller;

import com.example.Clients.model.Client;
import com.example.Clients.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@AllArgsConstructor 
public class ClientController {

    private final ClientService service;

    @GetMapping
    public List<Client> findAllStudents() {
        //todo
        return service.findAllStudents();
    }

    @PostMapping("save_client")
    public String saveClient(@RequestBody Client client){
          service.saveClients(client);
        return "Client was successfully added";
    }
    @GetMapping ("/{email}")
    public Client findClientByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_client")
    public Client updateClient(@RequestBody Client client){
        return service.updateClient(client);

    }
    @DeleteMapping("delete_client/{email}")
    public void deleteClient(@PathVariable String email){
        service.deleteClient(email);
    }
}
