package Study14.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {
        String filePath = "D:\\fileOutputStream.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(filePath);
            fo.write('a');
            String str = "hello,world!";
            fo.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
