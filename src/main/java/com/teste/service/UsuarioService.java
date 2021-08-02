package com.teste.service;

import com.teste.entity.Endereco;
import com.teste.entity.Usuario;
import com.teste.exception.UsuarioNaoEncontrado;
import com.teste.model.EnderecoDTO;
import com.teste.model.UsuarioDTO;
import com.teste.reposotory.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioDTO addUsuario(UsuarioDTO body){
        Usuario usuario = new Usuario();

        usuario.setCpf(body.getCpf());
        usuario.setDataNascimento(body.getDataNascimento());
        usuario.setEmail(body.getEmail());
        usuario.setNome(body.getNome());

        usuarioRepository.save(usuario);

        return body;

    }

    public UsuarioDTO getUsuario(BigInteger idUsuario){

        Usuario user = usuarioRepository.findById(idUsuario).orElseThrow(() -> new UsuarioNaoEncontrado(idUsuario));

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setCpf(user.getCpf());
        usuarioDTO.setDataNascimento(user.getDataNascimento());
        usuarioDTO.setEmail(user.getEmail());
        usuarioDTO.setNome(user.getNome());
        usuarioDTO.setEnderecos(mapListToDTO(user.getEndereco()));
        usuarioDTO.setId(user.getId());

        return usuarioDTO;

    }

    private List<EnderecoDTO> mapListToDTO (List<Endereco> lista){

        List<EnderecoDTO> retorno = new ArrayList<>();

        for (Endereco  endereco : lista)
        {
            EnderecoDTO enderecoDTO = new EnderecoDTO();
            enderecoDTO.setBairro(endereco.getBairro());
            enderecoDTO.setCep(endereco.getCep());
            enderecoDTO.setCidade(endereco.getCidade());
            enderecoDTO.setComplemento(endereco.getComplemento());
            enderecoDTO.setEstado(endereco.getEstado());
            enderecoDTO.setLogradouro(endereco.getLogradouro());
            enderecoDTO.setNumero(endereco.getNumero());
            retorno.add(enderecoDTO);
        }

        return retorno;

    }
}
