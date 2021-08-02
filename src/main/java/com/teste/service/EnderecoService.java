package com.teste.service;

import com.teste.client.ViaCepClient;
import com.teste.entity.Endereco;
import com.teste.model.EnderecoDTO;
import com.teste.model.RetornoViaCep;
import com.teste.reposotory.EnderecoRepository;
import com.teste.entity.Usuario;
import com.teste.exception.CepNaoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ViaCepClient viaCepClient;



    public EnderecoDTO adicionaEndereco(EnderecoDTO body) {

        usuarioService.getUsuario(body.getIdUsuario());

        RetornoViaCep retornoViaCep = new RetornoViaCep();

        retornoViaCep = viaCepClient.recuperarCep(body.getCep().toString());

        if (retornoViaCep.getErro()){

            throw new CepNaoEncontrado();
        }

         Endereco endereco = new Endereco();
         endereco.setBairro(body.getBairro());
         endereco.setCep(body.getCep());
         endereco.setCidade(body.getCidade());
         endereco.setComplemento(body.getComplemento());
         endereco.setEstado(body.getEstado());
         endereco.setLogradouro(body.getLogradouro());
         endereco.setNumero(body.getNumero());
         Usuario usuario = new Usuario();
         usuario.setId(body.getIdUsuario());
         endereco.setUsuario(usuario);

         repository.save(endereco);

         return body;

    }

}
