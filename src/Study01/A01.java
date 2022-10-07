package Study01;

import Study01.Class01.A;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        array a1 = new array();
        a1.max();

    }
}

class array {
    int length;
    double[] arr;

    public array() {
        Scanner arrScanner = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        this.length = arrScanner.nextInt();
        arr = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            System.out.println("请输入第" + i + "个元素：");
            this.arr[i] = arrScanner.nextDouble();
        }
    }

    void max() {
        double key = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (key < arr[i]) {
                key = arr[i];
            }
        }
        System.out.println("该数组的最大值为" + key);
    }
}