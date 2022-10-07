package Study10;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        while(true) {
            System.out.println("请输入用户名(长度为2-4)：");
            String name = s1.next();
            try {
                if (!(name.length() >= 2 && name.length() <= 4)) {
                    throw new RegisterException("输入的用户名有误，请重新输入！");
                }
                break;
            } catch (RegisterException e) {
                System.out.println(e.getMessage());
            }
        }
        Scanner s2 = new Scanner(System.in);
        while(true) {
            System.out.println("请输入密码(6位数字):");
            String password = s2.next();
            char[] passwordChar = password.toCharArray();
            try {
                if (!(password.length() == 6)) {
                    throw new RegisterException("输入的密码有误，请重新输入！");
                }
                for (int i = 0; i < passwordChar.length; i++) {
                    if (!(Character.isDigit(passwordChar[i]))) {
                        throw new RegisterException("输入的密码有误，请重新输入！");
                    }
                }
                break;
            } catch (RegisterException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}

class RegisterException extends RuntimeException{
    public RegisterException(String message) {
        super(message);
    }
}
