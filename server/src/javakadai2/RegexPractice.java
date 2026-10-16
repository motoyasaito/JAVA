//正規表現で文字列の操作
public class RegexPractice {
  public static void main(String[] args) {
    String input = "Java2026Spring06";
    String result = input.replaceAll("[0-9]", "");
    System.out.println(result);
  }
}