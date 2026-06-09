package pre;

import java.util.Scanner;

public class ScannerHasNext {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        if(keyboardScanner.hasNextInt()){
            int input = keyboardScanner.nextInt();
            System.out.printf("入力は整数%dと解釈できます\n",input);
        }else if(keyboardScanner.hasNextDouble()){
            double input = keyboardScanner.nextDouble();
            System.out.printf("入力は浮動小数点%8.2fと解釈できます\n",input);
        }else {
            String input = keyboardScanner.nextLine();
            System.out.printf("入力された%sは数値とは解釈できません\n",input);
        }

        keyboardScanner.close();
    }
}
