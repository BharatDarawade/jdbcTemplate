package com.bharat.demo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Tester {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		Student bharat=(Student) context.getBean("student");
		DataSource ds=(DataSource) context.getBean("dataSource");
		
		JdbcTemplate jdbcTemplate=(JdbcTemplate) context.getBean("jdbcTemplate");;
		
		/*String str="insert into student(name,rollNo,marks) values('bharat',1,80)";
		int row=jdbcTemplate.update(str);
		System.out.println(row);
		*/
		List<Student> name=(List<Student>) jdbcTemplate.query("select * from student", new BeanPropertyRowMapper(Student.class));
		System.out.println(name);
		Student student1=(Student) jdbcTemplate.queryForObject("select * from student where rollNo=?",new Object[] {"1"}, new BeanPropertyRowMapper(Student.class));
		System.out.println(student1);
		
		
	}

}

class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet arg0, int arg1) throws SQLException {
		Student student=new Student();
		student.setId(arg0.getInt("id"));
		student.setName(arg0.getString("name"));
		//student.setMarks(arg0.getDouble(""));
		return student;
	}
	
	
}
