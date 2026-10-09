//ラムダ式
import java.util.function.BiFunction;

public class LambdaPractice {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> multiPly = (a, b) -> a * b;

    System.out.println(multiPly.apply(10, 50));
  }
}