//課題5
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}
public class ExceptionPractice {
  public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException( age + "歳です！");
    }
    System.out.println(age + "です");
  }

  public static void main(String[] args) {
    try {
      checkAge(10);
    } catch (InvalidAgeException e) {
      System.out.println("エラー発生" + e.getMessage());
    }
  }
}
