package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email1 = new Email("John", "Smith");
		Email email2 = new Email("Peter", "Tran");
		
		System.out.println();
		System.out.println(email1.toString());
		System.out.println();
		System.out.println(email2.toString());
	}
}
