package api.spring.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.spring.sb.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
}
    

