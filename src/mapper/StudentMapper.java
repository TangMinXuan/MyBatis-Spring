package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.Student;

@Repository
public interface StudentMapper 
{
	public Student selectStudentById(@Param("Stu_id") int id);
}
