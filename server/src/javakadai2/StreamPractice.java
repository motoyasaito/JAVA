//ストリームを使ってデータを一気に変換
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamPractice {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);
    List<Integer> doubled = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
    System.out.println(doubled);
  }
}