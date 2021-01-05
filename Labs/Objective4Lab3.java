import java.util.Scanner;
import java.util.Calendar;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    String birthdayYet, newLineConsumer;
    boolean flag = true;

    Scanner input = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();

    System.out.println("How old are you?");
    age = input.nextInt();
    /**
     When entering input for age there is a hidden \n after the int.
     without the following line(20) the program will accept this \n as the next
     String input, Making it appear as if the scanner does not wait for input.
     */
    newLineConsumer = input.nextLine();
    currentYear = cal.get(Calendar.YEAR);
    birthYear = currentYear - age;

    while (flag) {
      System.out.println("Have you had your birthday yet THIS year? Enter yes or no");
      birthdayYet = input.nextLine();
      if (birthdayYet.equals("yes")) {
        System.out.println("You were born in " + birthYear);
        flag = false;
      } else if (birthdayYet.equals("no")) {
        System.out.println("You were born in " + (birthYear - 1));
        flag = false;
      } else {
        System.out.println("You must enter either yes or no");
      }
    }
    input.close();
  }
}
