package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Hospital;
import com.cts.repository.HospitalRepository;
@Service
@Transactional
public class HospitalService {
	@Autowired
	HospitalRepository  repository;
	
	public List<Hospital> getAlldetails(){
		return (List<Hospital>) repository.findAll();
	}
	
	public Hospital createhospitadetails(Hospital hospitalDetails) {
		return repository.save(hospitalDetails);
	}
}
