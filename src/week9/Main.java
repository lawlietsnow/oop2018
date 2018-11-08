
package week9;

import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        String path="test.txt";
        Utils.writeContentToFile(path);
        System.out.println(Utils.readContentFromFile(path)+"\n////////////////////////");
        Utils.writeContentToFileWithoutOverriding(path);
        System.out.println(Utils.readContentFromFile(path));
        String folderPath="H:\\";
        String fileName="asd.txt";
        File file = Utils.findFileByName(folderPath, fileName);
        if(file.exists()) System.out.println("Tim thay file");
        else System.out.println("Khong tim thay File");
    }
    
}
