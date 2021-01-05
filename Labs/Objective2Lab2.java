public class Objective2Lab2 {
  public static void main(String[] args) {
    String name = "Thomas Webel";
    int age = 26;
    String state = "Maine";
    String message = String.format("Name: %s" + " Age: %d" + " State: %s", name, age, state);
    System.out.println(message);
    // or
    String sameMessage = "Name: " + name + " Age: " + age +" State: " + state;
    System.out.println(sameMessage);
  }
}
/** expected output
  Name: Thomas Webel Age: 26 State: Maine
  Name: Thomas Webel Age: 26 State: Maine
*/
