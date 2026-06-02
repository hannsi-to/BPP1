package pre;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("一つ目の整数を入力してください: ");
        int input1 = keyboardScanner.nextInt();
        System.out.print("二つ目の整数を入力してください: ");
        int input2 = keyboardScanner.nextInt();

        System.out.println("和　差　積　商　剰余　符号反転の順に表示します");
        System.out.println(input1 + input2);
        System.out.println(input1 - input2);
        System.out.println(input1 * input2);
        System.out.println(input1 / input2);
        System.out.println(input1 % input2);
        System.out.println(-input1);
        keyboardScanner.close();
    }
}
