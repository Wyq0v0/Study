package Study14;

import java.io.File;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) {
        String filePath = "D:\\hello.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hi");
        System.out.println("hihi");
    }
}
