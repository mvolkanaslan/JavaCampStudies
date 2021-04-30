package HomeWork2Day3;

public class UserManager {
	public void add(User user) {
		System.out.println("User Added : " + user.firstName + " " + user.lastName);
	}
	public void delete(User user) {
		System.out.println("User Deleted : " + user.firstName + " " + user.lastName);
	}
	public void update(User user) {
		System.out.println("User Updated : " + user.firstName + " " + user.lastName);
	}
	public void getUserById(User user) {
		System.out.println("User  : " + user.firstName + " " + user.lastName +"id :"+user.id);
	}

}
