package pre;

import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int input = keyboardScanner.nextInt();

        input += 5;
        System.out.printf("入力に5を加えると%dになります. \n",input);
        input *= 3;
        System.out.printf("さらに3かけると%dになります. \n",input);
        keyboardScanner.close();
    }
}
