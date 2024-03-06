package api.spring.sb.service;

import org.springframework.stereotype.Service;

import api.spring.sb.entites.Client;
import api.spring.sb.repository.ClientRepository;

@Service

public class ClientService {

    private ClientRepository clientRepository;

    public ClientService (ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public void creer(Client client){
        clientRepository.save(client);
    }
}
