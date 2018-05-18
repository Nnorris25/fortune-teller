import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the fortune teller.");
		System.out.println("                              ");

		System.out.println("What is your first name?");
		String response = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How old are you?");
		int age = input.nextInt();
		
		int retirementYears = 0;
		if (age % 2 == 0) {
			 retirementYears = 20;
			{
			}
		} else {
			 retirementYears = 45;
		}
		

		System.out.println("What month is your birthday in numbers?");{
		int month = input.nextInt();
		input.nextLine();
		
		int bankAccount = 0;
		if (month == 1 || month <= 4) {
			bankAccount = 125000;
		}
		if (month == 5 || month == 6) {
			bankAccount = 350000;
		}
		if (month >= 7 || month <= 12) {
			bankAccount = 3400000;
		}
		if (month > 12) {
			bankAccount = 0;
		}
		
		System.out.println("What is your favorite ROYGBIV color?" + " If you dont know ROYGBIV type \"Help\"");
		String color = input.nextLine();
		if (color.toLowerCase().equals("help")) {
			System.out.println("Please choose Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			color = input.nextLine();
		}
		String car = "Camry";
		switch (color.toLowerCase()) {
		case "red":
			break;
		case "orange":
			car = "Accord";
			break;
		case "yellow":
			car = "Tesla";
			break;
		case "green":
			car = "Jeep Wrangler";
			break;
		case "blue":
			car = "Ferrari";
			break;
		case "indigo":
			car = "Mini Van";
			break;
		case "violet":
			car = "Motorcycle";
			break;
		default:
			System.out.println("You are not playing along");
			break;
		}
		
			
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		input.nextLine();
		String vacationHome = "";
		switch (siblings) {
		case 1:
			vacationHome = "Maui";
			break;
		case 2:
			vacationHome = "Bora Bora";
			break;
		case 3:
			vacationHome = "San Diego";
			break;

		default:
			System.out.println("You are broke and will never have a vacation home, loser!");
			break;
		}

		
		System.out.println( response + " " + lastName + " will retire in " + retirementYears + " years with " + bankAccount
				+ " in the bank, a vacation home in " + vacationHome + " and travel by " + car + ".");
		}
	}}
