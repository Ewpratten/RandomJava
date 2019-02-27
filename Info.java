import java.util.Scanner

public class Info{
	public static void main(String[] args){
		System.out.println("Please enter your information so I can sell it to facebook");

		Scanner stdin = new Scanner(System.in);

		System.out.print("First name: ");
		String fname = stdin.nextLine();

		System.out.print("Last name: ");
		String lname = stdin.nextLine();
		
		System.out.print("Grade \(9-12\): ");

	}
}
