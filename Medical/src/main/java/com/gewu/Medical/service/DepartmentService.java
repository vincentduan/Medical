package com.gewu.Medical.service;

import java.util.List;

import com.gewu.Medical.model.Department;

public interface DepartmentService extends BaseService<Department> {
	public List<Department> getAllDepartment();
}
