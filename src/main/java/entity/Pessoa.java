package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column
	private String nome;
	
	@Column
	private String cargo;
	
	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getNome() {
		return nome;
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	 
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
