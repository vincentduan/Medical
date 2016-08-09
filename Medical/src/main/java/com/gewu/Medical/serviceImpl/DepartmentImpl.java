package com.gewu.Medical.serviceImpl;

import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.DepartmentMapper;
import com.gewu.Medical.model.Department;
import com.gewu.Medical.model.DepartmentExample;
import com.gewu.Medical.model.DepartmentExample.Criteria;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.model.DoctorExample;
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
		if (t == null) {
			return 0;
		}
		return departmentMapper.insertSelective(t);
	}

	@Override
	public int update(Department t) {
		if (t == null) {
			return 0;
		}
		return departmentMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteByPrimaryKey(Integer.parseInt(id+""));
	}

	@Override
	public void queryByPage(Page<Department> page, Department t) {
		// TODO Auto-generated method stub
		DepartmentExample departmentExample = new DepartmentExample();
		Criteria criteria= departmentExample.createCriteria();
		if(t!=null){
			criteria.andIsdelEqualTo(false);
		}
		page2Exam(page, departmentExample);
	}
	private void page2Exam(Page<Department> page, DepartmentExample departmentExample) {
		// TODO Auto-generated method stub
		if (page != null && departmentExample != null) {
			departmentExample.setLimitEnd(page.getPageSize());
			departmentExample.setLimitStart(page.getPageSize() * (page.getPageNo() - 1));
			if (page.getOrderBy() != null && page.getOrderBy().length() < 20) {
				departmentExample.setOrderByClause(StringEscapeUtils.escapeSql(page.getOrderBy()));
			}
		}
	}

	@Override
	public List<Department> getAllDepartment() {
		DepartmentExample departmentExample = new DepartmentExample();
		List<Department> list= departmentMapper.selectByExample(departmentExample);
		return list;
	}

}
