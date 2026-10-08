public class Person {
 private int id;
 private String name;
 private int age;
  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
  void jouhou() {
    System.out.println("ID: " + id + " 名前: " + name + " 年齢: " + age);
  }
}