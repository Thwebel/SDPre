import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();
      if (userNum > 0) {
        System.out.println(userNum + " is greater than " + "0");
      }
      else if (userNum < 0) {
        System.out.println(userNum + " is less than " + "0");
      }
      else if (userNum == 0) {
        System.out.println(userNum + " is " + "0");
      }
      scanner.close();
  }
}
