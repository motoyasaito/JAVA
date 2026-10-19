import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
  public static void main(String[] args) {
    File f = new File("example.txt");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) { 
      bw.write("Hello, Java!\nThis is a file example.");
      bw.newLine();
    } catch (IOException e) {
      System.out.println(e);
    }
    try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("ファイルの読み込み中にエラーが発生しました");
      e.printStackTrace();
    }
  }
}