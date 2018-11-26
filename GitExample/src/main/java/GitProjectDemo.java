
public class GitProjectDemo {

	public static void main(String[] args) {
		
		System.out.println("Im in main");
		
		showMe();

	}
	public static void showMe() {
		System.out.println("Another person can also edit my project");
		System.out.println("Using Pull option");
		System.out.println();
		create();
	}
	public static void create() {
		System.out.println("Welcome to Rj world : ");
		System.out.println("________________________");
		System.out.println("Im create method : ");
	}

}
