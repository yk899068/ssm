package com.yangkun.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangkun.bean.Department;
import com.yangkun.bean.Employee;
import com.yangkun.dao.DepartmentMapper;
import com.yangkun.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSession sqlSession;
	@Test
	public void testCRUD(){
		System.out.println(departmentMapper);
		//	departmentMapper.insertSelective(new Department(null, "���²�"));
		//1�����뼸������
//		departmentMapper.insertSelective(new Department(null, "������"));
//		departmentMapper.insertSelective(new Department(null, "���Բ�"));
		
		//2������Ա�����ݣ�����Ա������
		//employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		
		//3������������Ա����������ʹ�ÿ���ִ������������sqlSession,��Ҫ�����ļ�applicationContext����ʹ�ã���ΪĬ�ϲ����������롣
		
//		for(){
//			employeeMapper.insertSelective(new Employee(null, , "M", "Jerry@atguigu.com", 1));
//		}���������������
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		for(int i = 0;i<10;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			
		}
		System.out.println("�������");
	}
}
