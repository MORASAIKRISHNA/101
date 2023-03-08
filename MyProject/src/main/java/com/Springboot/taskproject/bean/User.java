package com.Springboot.taskproject.bean;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@ElementCollection
	@CollectionTable(name = "roles_tab",joinColumns = @JoinColumn(name="id"))
	@Column(name="role")
	private List<String> roles;
	public Integer getid() {
		// TODO Auto-generated method stub
		return null;
	}
}
