import java.lang.reflect.*;

class Person {
  private String name;
  public int age;

  public Person() {}
  public void sayHello() {
    System.out.println("Hello");
  }
}

public class ReflectionPractice {
  public static void main(String[] args) {
    Class<?> clazz = Person.class;

    System.out.println("フィールド一覧");
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field.getName() + " (" + field.getType() + ")");
    }
    System.out.println("\nメソッド一覧");
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }
  }
}