package com.example.app.SpringBootWebClients.service;

import com.example.app.SpringBootWebClients.entity.Client;
import com.example.app.SpringBootWebClients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;

    //Todo: Вытягиваем все данные из репозитория.

    public String getAllInfo(){
        StringBuilder sb = new StringBuilder();
       Iterable<Client> all = repository.findAll();
        for (Client client : all) {
            sb.append(client.getId()).append(") ").append(client.getLastName())
                    .append(", ").append(client.getFirstName()).append(". ")
                    .append("phone: ").append(client.getPhone());
        }
       return sb.toString();
    }

}
