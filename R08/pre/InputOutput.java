package pre;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int input1 = keyboardScanner.nextInt();
        System.out.printf("入力は%4dです. \n",input1);

        System.out.print("浮動小数点を入力してください: ");
        double input2 = keyboardScanner.nextDouble();
        System.out.printf("入力は少数記号で%6.2f,指数記号で%10.2eです.\n",input2,input2);
        keyboardScanner.close();
    }
}
