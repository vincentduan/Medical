package com.gewu.Medical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.DepartmentMapper;
import com.gewu.Medical.model.Department;
import com.gewu.Medical.service.DepartmentService;
import com.gewu.Medical.utils.Page;

@Service
public class DepartmentImpl implements DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public Department findById(Long id) {
		if (id == null)
			return null;
		return departmentMapper.selectByPrimaryKey(Integer.parseInt(id+""));
	}

	@Override
	public int save(Department t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Department t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void queryByPage(Page<Department> page, Department t) {
		// TODO Auto-generated method stub

	}

}
