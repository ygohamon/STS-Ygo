package br.com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.main.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long > {

}
