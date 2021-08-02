package com.teste.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

public class EnderecoDTO {

    @NotNull(message = "Campo Obrigatório")
    private String logradouro;
    private String complemento;
    @NotNull(message = "Campo Obrigatório")
    private String bairro;
    @NotNull(message = "Campo Obrigatório")
    private String cidade;
    @NotNull(message = "Campo Obrigatório")
    private String estado;
    @NotNull(message = "Campo Obrigatório")
    private BigInteger numero;
    @NotNull(message = "Campo Obrigatório")
    @Size(min = 8,  max = 8, message = "CEP Inválido")
    private String cep;
    private BigInteger id;
    @NotNull(message = "Campo Obrigatório")
    private BigInteger idUsuario;

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
