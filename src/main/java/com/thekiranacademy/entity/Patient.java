package com.thekiranacademy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient {
 @Id
  int idp;
  String namep;
@Override
public String toString() {
	return "Patient [idp=" + idp + ", namep=" + namep + "]";
}
public Patient(int idp, String namep) {
	super();
	this.idp = idp;
	this.namep = namep;
}
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
  
	
}
