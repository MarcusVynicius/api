package com.teste.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column(name= "logradouro")
    private String logradouro;
    @Column(name= "complemento")
    private String complemento;
    @Column(name= "bairro")
    private String bairro;
    @Column(name= "cidade")
    private String cidade;
    @Column(name= "estado")
    private String estado;
    @Column(name= "numero")
    private BigInteger numero;
    @Column(name= "cep")
    private String cep;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    public BigInteger getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
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
