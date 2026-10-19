//課題3
public class StringReverse {
  public String reverse() {
    String str = "Hello World";
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}