package HomeWork2Day3;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println("Student Added : " + student.firstName + " " + student.lastName);
	}
	public void delete(Student student) {
		System.out.println("Student Deleted : " + student.firstName + " " + student.lastName);
	}
	public void update(Student student) {
		System.out.println("Student Updated : " + student.firstName + " " + student.lastName);
	}
	public void getUserById(Student student) {
		System.out.println("Student  : " + student.firstName + " " + student.lastName +"id :"+student.id);
	}

}
