package com.teste.controller;


import com.teste.model.UsuarioDTO;
import com.teste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigInteger;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/{identificadorUsuario}")
    public ResponseEntity<UsuarioDTO> getUsuario(@PathVariable BigInteger identificadorUsuario){

        UsuarioDTO usuario = usuarioService.getUsuario(identificadorUsuario);

        return ResponseEntity.ok(usuario);

    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<UsuarioDTO> addUsuario(@Valid @RequestBody UsuarioDTO body){

        UsuarioDTO usuario =  usuarioService.addUsuario(body);

        return new ResponseEntity<>(usuario, HttpStatus.CREATED);

    }


}
