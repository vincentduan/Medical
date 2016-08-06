package com.ddy.Medical.serviceImpl;

import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddy.Medical.dao.DoctorMapper;
import com.ddy.Medical.model.Doctor;
import com.ddy.Medical.model.DoctorExample;
import com.ddy.Medical.service.DoctorService;
import com.ddy.Medical.utils.Page;

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
	@Override
	public Doctor findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int save(Doctor t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Doctor t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void queryByPage(Page<Doctor> page, Doctor t) {
		// TODO Auto-generated method stub
		DoctorExample doctorExample = new DoctorExample();
		page2Exam(page, doctorExample);
		int total = doctorMapper.countByExample(doctorExample);
		List<Doctor> list = doctorMapper.selectByExample(doctorExample);
		page.setTotalCount(total);
		page.setResult(list);
	}
	private void page2Exam(Page<Doctor> page, DoctorExample doctorExample) {
		// TODO Auto-generated method stub
		if (page != null && doctorExample != null) {
			doctorExample.setLimitEnd(page.getPageSize());
			doctorExample.setLimitStart(page.getPageSize() * (page.getPageNo() - 1));
			if (page.getOrderBy() != null && page.getOrderBy().length() < 20) {
				doctorExample.setOrderByClause(StringEscapeUtils.escapeSql(page.getOrderBy()));
			}
		}
	}

}
