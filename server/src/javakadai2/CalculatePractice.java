import java.util.Scanner;
public class CalculatePractice {
  //課題1
    public int calculate(int a) {
      int mul = a * 2;
      return mul;
    }
    public int calculate(int a, int b) {
      int mul = a * b;
      return mul;
    }
    //課題2
    public String ul() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("hello: ");
      String input = scanner.nextLine();
      scanner.close();
      return input;
    }
  public static void main(String[] args) {
    CalculatePractice calculatePractice = new CalculatePractice();

    System.out.println(calculatePractice.calculate(5));
    System.out.println(calculatePractice.calculate(3, 4));
    System.out.println(calculatePractice.ul().toUpperCase());
    StringReverse stringReverse = new StringReverse();
    System.out.println(stringReverse.reverse());
  }
}
