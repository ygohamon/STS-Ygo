package br.com.crud.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.main.Cliente;
import br.com.crud.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}
	public void remover(Long id) {
		repository.delete(id);
	}
	public void findOne(Long id) {
		repository.findOne(id);
	}
	public void edit(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}
	public ArrayList<Cliente> clientes(){
		repository.findAll();
		return clientes();
	}
}
