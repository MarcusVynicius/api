package com.teste.reposotory;

import com.teste.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, BigInteger> {


}
