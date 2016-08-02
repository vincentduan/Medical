package com.ddy.Medical.service;

import java.util.List;

import com.ddy.Medical.model.Doctor;

public interface DoctorService {
	public List<Doctor> findDoctorsByDepartment(int departmentid);

	public List<Doctor> findAllDoctors();

}
