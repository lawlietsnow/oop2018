
package week9;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        String path="test.txt";
        Utils.writeContentToFile(path);
        System.out.println(Utils.readContentFromFile(path));
        String s0="H:\\";
        String s1="asd.txt";
        try {
            File file = Utils.findFileByName( s0 , s1 );
            if(file.exists()) System.out.println("Tim thay file");
            else System.out.println("khong tim thay file");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
