package com.subhash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class MyAppRunner implements ApplicationRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		jdbcTemplate.execute("DROP TABLE IF EXISTS EMP ");
		jdbcTemplate.execute("CREATE TABLE EMP (EMPNO INT,ENAME VARCHAR(20),SAL DOUBLE,DEPTNO INT,PRIMARY KEY(EMPNO))");
		System.out.println("MyAppRunnerComponent Table is Created");
		jdbcTemplate.update("INSERT INTO EMP VALUES(7209,'SMITH',6000.0,20)");
		jdbcTemplate.update("INSERT INTO EMP VALUES(7708,'ALLEN',4000.0,10)");
		jdbcTemplate.update("INSERT INTO EMP VALUES(7652,'SOFIA',8000.0,30)");
		jdbcTemplate.update("INSERT INTO EMP VALUES(7785,'SCOTT',5000.0,10)");
		jdbcTemplate.update("INSERT INTO EMP VALUES(7186,'MILLER',6000.0,20)");
		System.out.println("MyAppRunner::Rows are inserted");
	}
}
