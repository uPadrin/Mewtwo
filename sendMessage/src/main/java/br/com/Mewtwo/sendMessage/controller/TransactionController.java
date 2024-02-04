package br.com.Mewtwo.sendMessage.controller;

import br.com.Mewtwo.sendMessage.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.rabbitmq.dtos.TransactionDTO;
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

    private final TransactionService service;

    @PostMapping
    public ResponseEntity<TransactionDTO> produces(@RequestBody TransactionDTO dto) {
        service.createTransaction(dto);
        return ResponseEntity.status(CREATED).build();
    }
}
