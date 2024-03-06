package api.spring.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import api.spring.sb.entites.Client;
import api.spring.sb.repository.ClientRepository;

@Service

public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client) {
        clientRepository.save(client);
    }

    public List<Client> liretout() {
        return clientRepository.findAll();
    }

    public Client lire(int id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            return optionalClient.get();
        }
        return null;
    }
}