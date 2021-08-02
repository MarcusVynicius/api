package com.teste.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigInteger;

@ResponseStatus(HttpStatus.NOT_FOUND) // 404
public class UsuarioNaoEncontrado extends RuntimeException {

    public UsuarioNaoEncontrado(BigInteger idUsuario){
        super("Usuario " + idUsuario + " não existe.");
    }



}
