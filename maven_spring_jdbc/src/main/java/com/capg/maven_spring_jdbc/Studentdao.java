package com.capg.maven_spring_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Studentdao {

	@Autowired
	private JdbcTemplate  jdbctemplate ;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	} 
	
	public int saveStudent(Details st)
	{
		 String sql = "insert into details values(?,?)";
	return jdbctemplate.update(sql, st.getStid(),st.getStname());
	
	}
}
