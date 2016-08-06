package com.gewu.Medical.service;

import java.util.List;

import com.gewu.Medical.model.Doctor;

public interface DoctorService extends BaseService<Doctor> {
	public List<Doctor> findDoctorsByDepartment(int departmentid);

	public List<Doctor> findAllDoctors();
	
	

}
