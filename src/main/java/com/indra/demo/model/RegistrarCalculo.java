package com.indra.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registro_calculo")
public class RegistrarCalculo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="resultado")
	private int resultado;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="fecha_ejecucion")
	private Timestamp fecha_ejecucion;

	public RegistrarCalculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrarCalculo(int id, int resultado, String usuario, Timestamp fecha_ejecucion) {
		super();
		this.id = id;
		this.resultado = resultado;
		this.usuario = usuario;
		this.fecha_ejecucion = fecha_ejecucion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Timestamp getFecha_ejecucion() {
		return fecha_ejecucion;
	}

	public void setFecha_ejecucion(Timestamp fecha_ejecucion) {
		this.fecha_ejecucion = fecha_ejecucion;
	}
	
}
