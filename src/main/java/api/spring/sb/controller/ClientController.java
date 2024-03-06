package api.spring.sb.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import api.spring.sb.entites.Client;
import api.spring.sb.service.ClientService;

@RestController
@RequestMapping("client")

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Client client) {
        this.clientService.creer(client);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Client> liretout() {
        return this.clientService.liretout();
    };

    @GetMapping("{id}")
    public Client supprimer(@PathVariable int id) {
        return this.clientService.lire(id);
    }
}
