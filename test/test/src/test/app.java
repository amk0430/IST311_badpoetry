package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class app {

    public static void main(String[] args) {
      BufferedReader objReader = null;
      try
      {
          String commandLinetxt;
          objReader = new BufferedReader(new FileReader("src/toolForRent.txt"));

          while ((commandLinetxt = objReader.readLine()) != null) {
            System.out.println(commandLinetxt);
          }

      } catch (IOException e) {
        e.printStackTrace();
    }

    try
    {
        String commandLinetxt;
        objReader = new BufferedReader(new FileReader("src/customerInfo.txt"));

        while ((commandLinetxt = objReader.readLine()) != null) {
          System.out.println(commandLinetxt);
        }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
