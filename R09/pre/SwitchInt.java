package pre;

import java.util.Scanner;

public class SwitchInt {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        int position;

        System.out.print("順位を入力してくださ: ");
        position = keyBoardScanner.nextInt();

        switch (position) {
            case 1:
                System.out.println("金メダルです");
                break;
            case 2:
                System.out.println("銀メダルです");
                break;
            case 3:
                System.out.println("銅メダルです");
                break;
            default:
                System.out.println("メダルなしです");
                break;
        }

        keyBoardScanner.close();
    }
}
