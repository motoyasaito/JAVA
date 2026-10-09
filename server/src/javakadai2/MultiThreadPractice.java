//マルチスレッド
class MyThread extends Thread {
  public void run() {
    for (int i = 1 ; i <= 5; i++) {
      System.out.println("Hello, Wolrd! (" + i + ")");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class MultiThreadPractice {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();
  }
}