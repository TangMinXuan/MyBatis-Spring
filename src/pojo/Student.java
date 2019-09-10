package pojo;

public class Student 
{
	int Stu_id;
	String Stu_name;
	Boolean Stu_sex;
	
	public Boolean getStu_sex() {
		return Stu_sex;
	}
	public void setStu_sex(Boolean stu_sex) {
		Stu_sex = stu_sex;
	}
	public int getStu_id() {
		return Stu_id;
	}
	public void setStu_id(int stu_id) {
		Stu_id = stu_id;
	}
	public String getStu_name() {
		return Stu_name;
	}
	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}
	
	@Override
	public String toString() 
	{
		System.out.println("Stu_id: "+Stu_id);
		System.out.println("Stu_name: "+Stu_name);
		System.out.println("Stu_sex: "+Stu_sex);
		return "\n";
	}
}
