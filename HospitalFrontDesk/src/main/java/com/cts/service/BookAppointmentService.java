package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.BookAppointment;
import com.cts.repository.BookAppointmentRepository;
@Service
@Transactional
public class BookAppointmentService {
	@Autowired
	BookAppointmentRepository repository;
	
	public List<BookAppointment> getAlldetails(){
		return (List<BookAppointment>) repository.findAll();
	}
	
	public BookAppointment createbookappointment(BookAppointment bookappointment) {
		return repository.save(bookappointment);
	}
}
