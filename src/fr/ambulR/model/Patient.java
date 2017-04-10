package fr.ambulR.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Entity
@Table(name="patient")
public class Patient extends Connexion {
	

	@NotEmpty(message="rentrer le nom")
	@Column (name="patient_nom")
	private String nom;
	
	
	@NotEmpty(message="rentrer le prenom")
	@Column (name="patient_prenom")
	private String prenom;
	
	@Column (name="patient_dateDeNaissance")
	@NotEmpty(message="rentrer votre date de naissance")
	private String dateDeNaissance;
	
	@Column (name="patient_sexe")
	@NotEmpty(message="rentrer le sexe")
	private String sexe;
	
	@Column (name="patient_adresse")
	@NotEmpty(message="rentrer l'adresse")
	private String adresse;
	
	@Column (name="patient_tel")
	@NotEmpty(message="rentrer le tel")
	private String tel;
	
	@Column (name="patient_nomU")
	@NotEmpty(message="rentrer le nomU")
	private String nomU;
	
	@Column (name="patient_prenomU")
	@NotEmpty(message="rentrer le prenomU")
	private String prenomU;
	
	@Column (name="patient_telU")
	@NotEmpty(message="rentrer le telU")
	private String telU;
	
	@Column (name="patient_DMP")
	@NotEmpty(message="rentrer le DMP")
	private String DMP;
	
	@Column (name="patient_numSecu")
	@NotEmpty(message="rentrer le numSecu")
	private String numSecu;
	
	@Column (name="patient_password")
	@NotEmpty(message="rentrer le password")
	private String password;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setAge(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNomU() {
		return nomU;
	}
	public void setNomU(String nomU) {
		this.nomU = nomU;
	}
	public String getPrenomU() {
		return prenomU;
	}
	public void setPrenomU(String prenomU) {
		this.prenomU = prenomU;
	}
	public String getTelU() {
		return telU;
	}
	public void setTelU(String telU) {
		this.telU = telU;
	}
	public String getDMP() {
		return DMP;
	}
	public void setDMP(String dMP) {
		DMP = dMP;
	}
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	

	
}
