package Study14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {
        String path = "D:\\nihao.txt";
        File f1 = new File(path);
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.getParent());
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s1 = sc.next();
        if(f1.exists()){
            f1.delete();
            System.out.println("文件删除成功");
        }
        System.out.println("github pull测试");
    }
}
