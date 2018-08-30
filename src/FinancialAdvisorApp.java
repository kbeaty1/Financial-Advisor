import java.util.Scanner;

public class FinancialAdvisorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int moneyInBank;
		int yearsUntilRetirement;

		System.out.println("What is your first and last name?");

		String firstName = input.next();
		System.out.println(firstName);

		String lastName = input.next();
		System.out.println(lastName);

		System.out.println("What is your age?");
		String age = input.next();

		System.out.println("What your birth month number.");
		String birthMonth = input.next();

		System.out.println("How many siblings do you have?");
		String siblings = input.next();

		System.out.println("What is your favorite ROYGBIV color?");
		System.out.print("Type help, for ROYGBIV colors.");
		String validateInput = input.next();

		System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
		String roygbivHelp = input.next();

		{

		}
	}
}