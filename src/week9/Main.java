
package week9;

public class Main {
    public static void main(String[] args) {
        final String path="test.txt";
          Utils.writeContentToFile(path);
          System.out.println(Utils.readContentFromFile(path));
         
    }
    
}
