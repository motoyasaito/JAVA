import java.util.Arrays;
//import JAVA.server.src.Main;
public class Main {
  public static void main(String[] args) {
    // no1.
    String test1 = "hoge";
      System.out.println(test1);
    // no2.
    int test2 = 69;
      System.out.println(test2);
      // no3.
      boolean test3 = false;
      System.out.println(test3);
      double test4;
      // no4.
      test4 = 1.15;
      System.out.println(test4);
      // no5.
      String test5 = null;
      System.out.println(test5);
      // no6.
      String[] test6 = {"田中","佐藤","久保田","鈴木","河本"};
      System.out.println(Arrays.toString(test6));
      // no7.
    Person person = new Person(1, "田中", 20);
    person.jouhou();
    great("中田");
    no3(10, 20);
    int answer = no3(10, 20);
    System.out.println(answer);
    String fullName = no4("田中", "太郎");
    System.out.println(fullName);
    no5(16);
      //配列no1.
      int[] nums1 = {10, 20, 30, 40, 50};

      for (int num : nums1) {
        System.out.println(num);
      }
       //配列no2
        int[] nums2 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : nums2) {
          sum += num;
        }
        System.out.println(sum);
        //配列no3
        int[] nums3 = {3, 5, 7, 2, 8};
        int max = nums3[0];
        for (int num : nums3) {
          if (num > max) {
            max = num;
          }
        }
        System.out.println(max);
        //配列no4.
        int[][] nums4 = {
          {1, 2, 3},
          {4, 5, 6}, 
          {7, 8, 9}
        };
      for(int[] row : nums4) {
        for(int num : row) {
          System.out.print(num + " ");
        }
        System.out.println();
      }
      Car car = new Car("トヨタ", 100);
      car.drive();
      //ループと条件分岐no1.
      for (int i = 1; i <= 20; i++) {
        if (i % 2 == 0) {
          System.out.println(i);
        }
      }
      //ループと条件分岐no2.
      for (int i = 1; i <= 30; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
          System.out.println("Fizz");
        } else if (i % 5 == 0) {
          System.out.println("Buzz");
        } else {
          System.out.println(i);
        }
      }
      //ループと条件分岐no3.
      int[] nums5 = {5, 10, 15, 20};
      for (int i = nums5.length; i > 0; i--) {
        System.out.println(nums5[i - 1]);
      }
      //例外処理
      int[] nums6 = {1, 2, 3};
      for (int i = 0; i < nums6.length + 1; i++) {
        try {
          System.out.println(nums6[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("配列の範囲外です");
        }
      }
  }
  //メソッド関数の宣言
  public static void great(String name) {
    //メソッドno2.
    System.out.println(name);
  }
  //メソッドno3.
  public static int no3(int no1, int no2) {
    return no1 + no2;
  }
  //メソッドno4.
  public static String no4(String no1, String no2) {
    return no1 + no2;
  }
  //メソッドno5.
  public static void no5(int age) {
    String ageStatus = 18 <= age ? "成年" : "未成年";
    System.out.println(ageStatus);
  }
}

