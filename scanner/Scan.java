import java.util.Scanner;

public class Scan{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Type something\n>");
		String input = stdin.nextLine();
		System.out.println("Good job!");
	}
}
