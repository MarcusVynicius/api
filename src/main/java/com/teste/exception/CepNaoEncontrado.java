package com.teste.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CepNaoEncontrado extends RuntimeException {

        public CepNaoEncontrado(){
            super("Cep não existe.");
        }
}

