package br.com.crud.main;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table (name = "cliente")
public class Cliente {
	public Long id;
	public String nome;
	public String email;
}
