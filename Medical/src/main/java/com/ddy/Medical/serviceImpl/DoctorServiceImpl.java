package com.ddy.Medical.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddy.Medical.dao.DoctorMapper;
import com.ddy.Medical.model.Doctor;
import com.ddy.Medical.model.DoctorExample;
import com.ddy.Medical.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorMapper doctorMapper;
	@Override
	public List<Doctor> findDoctorsByDepartment(int departmentid) {
		// TODO Auto-generated method stub
		DoctorExample doctorExample = new DoctorExample();
		DoctorExample.Criteria criteria = doctorExample.createCriteria();
		criteria.andDepartmentEqualTo(departmentid);
		List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
		return doctors;
	}
	@Override
	public List<Doctor> findAllDoctors() {
		DoctorExample doctorExample = new DoctorExample();
		List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
		return doctors;
	}

}
