package Study10;

import java.util.Scanner;

public class NameSplit {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入名字：");//Xxx Xxx Xxx
        String name = s1.nextLine();
        String[] nameSplit = name.split(" ");
        System.out.println(nameSplit[2] + "," + nameSplit[0] + " ." + nameSplit[1].toUpperCase().charAt(0));
    }
}
