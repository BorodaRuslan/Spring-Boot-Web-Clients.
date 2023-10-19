package com.example.app.SpringBootWebClients.repository;

import com.example.app.SpringBootWebClients.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
