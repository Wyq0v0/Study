package Study08;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("请输入一个整数：");
            String input = s1.next();
            try {
                num = Integer.parseInt(input);
            } catch (InputException e) {
                e.getMessage();
            }

        }
    }
}

class InputException extends RuntimeException{
    public InputException(String message) {
        super(message);
    }
}
