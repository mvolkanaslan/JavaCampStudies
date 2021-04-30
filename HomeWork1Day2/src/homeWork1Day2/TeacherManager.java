package homeWork1Day2;

import java.util.ArrayList;

public class TeacherManager {
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println("Teacher Added : " + teacher.name);
	}

	public void delete(Teacher teacher) {
		teachers.remove(teacher);
		System.out.println("Teacher Deleted : " + teacher.name);
	}

	public void getTeacher() {
		for (Teacher teacher : teachers) {
			System.out.println("Id : " + teacher.id + " - Name : " + teacher.name);
		}
	}

}
