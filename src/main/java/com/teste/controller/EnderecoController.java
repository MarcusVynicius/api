package com.teste.controller;

import com.teste.model.EnderecoDTO;
import com.teste.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;


    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<EnderecoDTO> addEndereco(@Valid @RequestBody EnderecoDTO body){

            EnderecoDTO endereco = enderecoService.adicionaEndereco(body);

        return new ResponseEntity<>(endereco, HttpStatus.CREATED);

    }

}
