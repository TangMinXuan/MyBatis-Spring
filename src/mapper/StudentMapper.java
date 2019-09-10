package mapper;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper 
{
	public void selectStudentById(@Param("Stu_id") int id);
}
