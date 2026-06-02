package pre;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int input = keyboardScanner.nextInt();

        System.out.printf("前置インクリメント時の値: %d\n",++input);
        System.out.printf("後置インクリメント時の値: %d\n",input++);
        System.out.printf("2回のインクリメント後の値: %d\n",input);
        System.out.printf("前置インクリメント時の値: %d\n",--input);
        System.out.printf("後置インクリメント時の値: %d\n",input--);
        System.out.printf("2回のデクレメント時の値: %d\n",input);
        keyboardScanner.close();
    }
}
