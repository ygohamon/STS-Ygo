package br.com.crud.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.crud.main.Cliente;
import br.com.crud.service.ClienteService;

@Controller
public class ClienteController {
	@Autowired
	private ClienteService service;
	public void salva(Cliente cliente) {
		service.salvar(cliente);
	}
	public void remover(Long id) {
		service.remover(id);
	}
	public void findOne(Long id) {
		service.findOne(id);
	}
	public void edit(Cliente cliente) {
		service.edit(cliente);
	}
	public ArrayList<Cliente> clientes(){
		service.clientes();
		return clientes();
	}
}
