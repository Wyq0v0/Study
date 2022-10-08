package Study14.inputstream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01(){
        String filePath = "D:\\hello.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte read[] = new byte[8];
        int readlength = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while((readlength = fileInputStream.read(read)) != -1){
                System.out.print(new String(read,0,readlength));
            };
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
