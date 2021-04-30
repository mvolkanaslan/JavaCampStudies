package HomeWork2Day3;

public class Main {

	public static void main(String[] args) {
		
		/*
		  `örnekte görüldüğü gibi soyut bır manager olmadan tip güvenliği sağlanarak oerasyonlar calıstırılmakta sıkıntı olusabiliyor.
		 */
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Student student1 =new Student();
		student1.setId(1);
		student1.setEmail("volkan@volkan.com");
		student1.setFirstName("Volkan");
		student1.setLastName("Aslan");

		Student student2 =new Student();
		student2.setId(2);
		student2.setEmail("mehmet@mehmet.com");
		student2.setFirstName("Mehmet");
		student2.setLastName("Aslan");
		
		Instructor instructor1 = new Instructor();
		 instructor1.setId(1);
		 instructor1.setEmail("engin@engin.com");
		 instructor1.setFirstName("Engin");
		 instructor1.setLastName("Demirog");
		 
		 studentManager.add(instructor1);
		 studentManager.add(student2);
		 instructorManager.add(instructor1);

	}

}
