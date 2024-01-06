package com.thekiranacademy.controller;
import javax.websocket.server.PathParam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thekiranacademy.entity.Patient;
@RestController
@CrossOrigin("http://localhost:4200")
public class PatientController {
	
	@Autowired
	SessionFactory factory;
	
	@PostMapping("savePatient")
	public String savePatient(@RequestBody Patient patient)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(patient);
		tx.commit();
		return"ok";
	}
	
@GetMapping("patintS/{idp}")
public Patient patintS(@PathVariable int idp) {
	Session session=factory.openSession();
	return session.get(Patient.class, idp);
}
	
}
