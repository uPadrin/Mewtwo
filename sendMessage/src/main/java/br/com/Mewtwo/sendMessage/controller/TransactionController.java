package br.com.Mewtwo.sendMessage.controller;

import br.com.Mewtwo.sendMessage.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.rabbitmq.dtos.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/transactions")
public class TransactionController {

    @Autowired
    private final TransactionService service;

    @PostMapping
    public ResponseEntity<TransactionDTO> produces(@RequestBody String dto) {
        service.createTransaction(dto);
        return ResponseEntity.status(CREATED).build();
    }
}
