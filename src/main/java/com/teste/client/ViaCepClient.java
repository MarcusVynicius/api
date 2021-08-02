package com.teste.client;

import com.teste.model.RetornoViaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping(value = "{cep}/json")
    public RetornoViaCep recuperarCep(@PathVariable("cep") String cep);

}
