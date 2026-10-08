public class Car {
  //クラスとオブジェクトno1.
  String brand;
  int speed;
  //クラスとオブジェクトno2.
  public void drive() {
    System.out.println("車が走り出しました");
    System.out.println(brand + "のスピードは" + speed + "km/hです");
  }
  //クラスとオブジェクトno3.
  public Car(String brand, int speed) {
    this.brand = brand;
    this.speed = speed;
  }
}