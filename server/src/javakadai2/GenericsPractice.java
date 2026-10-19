//ジェネリクスクラスの作成
class Box<T> {
  private T value;
  public void set(T value) {
    this.value = value;
  }

  public T get() {
    return value;
  }
}
public class GenericsPractice {
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println(stringBox.get());
    Box<Integer> intBox = new Box<>();
    intBox.set(1000);
    System.out.println(intBox.get());
  }
}