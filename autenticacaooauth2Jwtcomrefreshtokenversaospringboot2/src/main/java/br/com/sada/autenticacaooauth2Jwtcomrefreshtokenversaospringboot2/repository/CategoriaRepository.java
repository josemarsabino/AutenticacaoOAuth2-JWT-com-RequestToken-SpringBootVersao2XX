package br.com.sada.autenticacaooauth2Jwtcomrefreshtokenversaospringboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sada.autenticacaooauth2Jwtcomrefreshtokenversaospringboot2.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
