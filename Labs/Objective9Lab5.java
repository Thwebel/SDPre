import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;

    System.out.println("Give me a whole number!");
    num1 = kb.nextInt();
    System.out.println("give me another whole number!");
    num2 = kb.nextInt();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
      case 1:
        double sum = findSum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        break;
      case 2:
        double avg = findAverage(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + avg);
        break;
      case 3:
        double tax = calcTax(num1, num2);
        System.out.println("The tax to be collected from " + num1 + " and " + num2 + " is: " + tax);
        break;
      case 4:
      System.out.println("You have chosen to quit. Goodbye!");
      keepGoing = false;
      break;
      default:
        System.out.println("I'm sorry, but you must select options 1, 2, or 3.");
        break;
		  }
    }

		kb.close();
  }
	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}

  public static double findAverage(double x, double y) {
    double avg = (x + y) / 2;
    return avg;
  }

  public static double calcTax(double x, double y) {
    double tax = (x + y) * 0.081;
    return tax;
  }

}
