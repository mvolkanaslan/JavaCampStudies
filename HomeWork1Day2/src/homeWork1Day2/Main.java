package homeWork1Day2;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		TeacherManager teacherManager = new TeacherManager();		
		Teacher teacher1 = new Teacher(1, "Engin Demiroğ");
		Teacher teacher2 = new Teacher(2, "Kerem Varış");
		Teacher teacher3 = new Teacher(3, "Murat Mustafa Coşkun");		
		teacherManager.add(teacher1);
		teacherManager.add(teacher2);
		teacherManager.add(teacher3);
		System.out.println("Listing Teacher After Adding !");
		teacherManager.getTeacher();
		teacherManager.delete(teacher3);
		System.out.println("Listing Teacher After Deleting !");
		teacherManager.getTeacher();
		Course course1 = new Course(1, 1, "C# & Angular");
		Course course2 = new Course(2, 1, "Java & React JS");
		Course course3 = new Course(3, 1, "Programlamaya Giris");
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		System.out.println("Listing Courses After Adding !");
		courseManager.getCourses();		
		courseManager.delete(course3);
		System.out.println("Listing Courses After Deleting !");
		courseManager.getCourses();		
	}
}
