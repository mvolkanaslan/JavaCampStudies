package homeWork1Day2;

import java.util.ArrayList;

public class CourseManager {
	 
	ArrayList<Course> courses = new ArrayList<Course>();
	
	public void add(Course course) {
		courses.add(course);
		System.out.println("Course Added : " + course.name);		
	}
	public void delete(Course course) {
		courses.remove(course);
		System.out.println("Course Deleted : " + course.name);		
	}
	
	public void getCourses() {
		for(Course course:courses) {
			System.out.println("Id : " + course.id +" - Name : "+course.name);
		}
	}
}
