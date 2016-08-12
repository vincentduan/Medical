package com.gewu.Medical.serviceImpl;

import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.DoctorMapper;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.model.DoctorExample;
import com.gewu.Medical.model.DoctorExample.Criteria;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.utils.Page;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorMapper doctorMapper;
	@Override
	public List<Doctor> findDoctorsByDepartment(int departmentid) {
		// TODO Auto-generated method stub
		DoctorExample doctorExample = new DoctorExample();
		DoctorExample.Criteria criteria = doctorExample.createCriteria();
		//criteria.andDepartmentEqualTo(departmentid);
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
		if (id == null)
			return null;
		return doctorMapper.selectByPrimaryKey(Integer.parseInt(id+""));
	}
	@Override
	public int save(Doctor t) {
		// TODO Auto-generated method stub
		return doctorMapper.insertSelective(t);
	}
	@Override
	public int update(Doctor t) {
		// TODO Auto-generated method stub
		return doctorMapper.updateByPrimaryKeySelective(t);
	}
	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return doctorMapper.deleteByPrimaryKey(Integer.parseInt(id+""));
	}
	@Override
	public void queryByPage(Page<Doctor> page, Doctor d) {
		// TODO Auto-generated method stub
		DoctorExample doctorExample = new DoctorExample();
		Criteria criteria = doctorExample.createCriteria();
		if(d!=null){
			if(d.getUsername()!=null){
				criteria.andUsernameLike(d.getUsername());
				criteria.andIsdelEqualTo(false);
			}
		}
		criteria.andIsdelEqualTo(false);
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
