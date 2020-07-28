package com.cts.service;

import java.util.List;

import com.cts.model.BookAppointment;

public interface IBookAppointmentService {
	public List<BookAppointment> getAlldetails();
	public BookAppointment createbookappointment(BookAppointment bookappointment);
}
