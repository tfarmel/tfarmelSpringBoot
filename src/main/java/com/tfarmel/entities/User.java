package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	private long tel;

}
