import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int userNum;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a whole number: ");
    userNum = input.nextInt();
    if (userNum % 2 == 0) {
      System.out.println(userNum + " is an even number");
    }
    else {
      System.out.println(userNum + " is an odd number");
    }
    input.close();
  }
}
