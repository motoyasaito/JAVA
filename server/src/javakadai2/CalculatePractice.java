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
      return input;
    }
  public static void main(String[] args) {
    CalculatePractice a = new CalculatePractice();

    System.out.println(a.calculate(5));
    System.out.println(a.calculate(3, 4));
    System.out.println(a.ul().toUpperCase());
    StringReverse stringReverse = new StringReverse();
    System.out.println(stringReverse.reverse());
  }

}