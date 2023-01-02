package br.com.cad.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cad.entidade.Cadastro;

public interface RepositorioCad extends JpaRepository<Cadastro, Long> {

}