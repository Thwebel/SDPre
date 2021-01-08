import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {

    while(true){
      printMenu();
      provideResponse();
      break;

    }
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static void provideResponse() {
    Scanner scanner = new Scanner(System.in);
    int selection;
    selection = scanner.nextInt();

    if (selection == 1) {
      System.out.println("Hello!");
      printMenu();
      provideResponse();
    }
    else if (selection == 2) {
      System.out.println("Apples, Bananas, Coconuts");
      printMenu();
      provideResponse();

    }
    else if (selection == 3) {
      System.out.println("Goodbye!");
      scanner.close();
    }
    else {
      System.out.println("Please select one of the Three options: 1, 2, or 3.");
      printMenu();
      provideResponse();

    }
  }

}
