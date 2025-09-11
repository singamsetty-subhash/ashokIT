package com.subhash.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.subhash.model.Employee;




@Repository
public class EmployeeRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Employee e) {
		jdbcTemplate.update("INSERT INTO EMP VALUES(?,?,?,?)", e.getEmpno(), e.getEname(), e.getSal(), e.getDeptno());
	}

	public  void findById(int empno) {
		Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM EMP WHERE EMPNO=?", empno);
		map.forEach((k, v) -> System.out.println(k + ":" + v));

	}

	public void find_all() {
		List<Map<String, Object>> employees = jdbcTemplate.queryForList("SELECT * FROM EMP");
		for (Map<String, Object> Map : employees) {
			Map.forEach((k, v) -> System.out.println(k + ":" + v));
	}

	}

	public void update(int empno,double sal) {
			jdbcTemplate.update("UPDATE EMP SET SAL=? WHERE EMPNO=?", sal, empno);
			
		}
	public void deleteById(int empno) {
		jdbcTemplate.update("DELETE FROM EMP WHERE EMPNO =?",empno);
	}
}
