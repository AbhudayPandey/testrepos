package com.cts.controller;

import java.util.List;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.BookAppointment;
import com.cts.model.Patient;
import com.cts.model.Specialist;
import com.cts.service.BookAppointmentService;
import com.cts.service.PatientService;

@RestController
public class BookAppointmentController {
	@Autowired
	BookAppointmentService service;
	@Autowired 
	PatientService ser;
	@ResponseBody
	@Cacheable(value="BookAppointment",key="BookAppointment")
	@GetMapping("/BookAppointment")
	public List<BookAppointment> getAlldetails() {
	    return service.getAlldetails();
	}
	
	@PostMapping("/BookAppointment")
	public BookAppointment createbookappointment(@RequestBody BookAppointment bookappointment) {
	    return service.createbookappointment(bookappointment);
	}
	
//	@GetMapping("/BookAppointment/{pname}")
//	public ResponseEntity<List<Object>> getpatientDetails(@PathVariable String pname){
//		List<Object> getpatientDetails= ser.Byname(pname);
//		return new ResponseEntity<List<Object>>(getpatientDetails, HttpStatus.OK);
//	}
}
