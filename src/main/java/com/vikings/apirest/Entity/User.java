package com.vikings.apirest.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name="user")
@Table(name="user")
public class User {
/*PK == Primary Key*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
		
	@Column(name="user")
	private String user;
	
	@Column(name="password")
	private String password;
	
	@Column(name="tipo")
	private String tipo;
	
	/*parametros nombrados*/
	public User() {}
	public User(int id, String tipo, String password, String user) {
		this.id = id;
		this.tipo = tipo;
		this.password = password;
		this.user = user;
	}
	/*GET*/
	
	public int getId() {
		return this.id;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String getUser() {
		return this.user;
	}
	/*SET*/
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	/*OVERRIDE*/
	@Override
	public String toString() {
		return "User [id]"+ id +", tipo= "+ tipo + ",password= "+ randomPassword() + "User =" + user;
	}
	
	public String randomPassword() {
		return "";
	}
}
