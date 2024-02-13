package com.springboot.database.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

	@Autowired
	private JdbcTemplate springJDBCTemplate;
	private static String q1 = """
			
			insert into course(id, username, author) values (4, 'Mark', 'g34146v2433h');
			""";
	
	public void insert()
	{
		springJDBCTemplate.update(q1);
	}
}
