package com.teste.reposotory;

import com.teste.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, BigInteger> {



}
