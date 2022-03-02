package com.capg.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.capg.entites.StudentInfo;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate ;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int saveStudent(StudentInfo st)
	{
		Integer res = (Integer) hibernateTemplate.save(st);
		return res ;
	}
}
