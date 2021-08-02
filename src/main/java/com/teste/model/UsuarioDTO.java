package com.teste.model;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.List;

public class UsuarioDTO {

    @NotNull(message = "Campo Obrigatório")
    private String nome;
    @NotNull(message = "Campo Obrigatório")
    private String email;
    @NotNull(message = "Campo Obrigatório")
    private String cpf;
    @NotNull(message = "Campo Obrigatório")
    private String dataNascimento;
    private List<EnderecoDTO> enderecos;
    private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}