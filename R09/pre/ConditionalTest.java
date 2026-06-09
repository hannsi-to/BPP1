package pre;

import java.util.Scanner;

public class ConditionalTest {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        System.out.print("１つ目の数値を入力してください: ");
        int input1 = keyBoardScanner.nextInt();
        System.out.print("２つ目の数値を入力してください: ");
        int input2 = keyBoardScanner.nextInt();

        int largerNumber = input1 > input2 ? input1 : input2;
        System.out.printf("大きいほうの数値は%dです\n",largerNumber);
        keyBoardScanner.close();
    }
}
