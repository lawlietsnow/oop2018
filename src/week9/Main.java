
package week9;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final String path="test.txt";
          Utils.writeContentToFileWithoutOverriding(path);
          System.out.println(Utils.readContentFromFile(path));
         
    }
    
}
