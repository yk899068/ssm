package com.yangkun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangkun.bean.Department;
import com.yangkun.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	public List<Department> getAll(){
		List<Department> list=departmentMapper.selectByExample(null);
		return list;
	}
}
