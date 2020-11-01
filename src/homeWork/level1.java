package homeWork;
//从键盘中输入数字，判断是否是偶数，输出布朗值

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = in.nextInt();
        level1 demo = new level1();
         demo.Number(a);
    }

    public boolean Number(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;

    }

}
