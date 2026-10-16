//ファイルの存在確認
import java.io.File;

public class FileCheckPractice {
  public static void main(String[] args) {
    String filePath = "test.txt";

    File file = new File(filePath);

    if (file.exists()) {
      System.out.println("ファイルが見つかりました。");
    } else {
      System.out.println("ファイルが見つかりませんでした。");
    }
  }
}