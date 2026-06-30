package pre;

import java.util.Scanner;

public class ComparisonOfString1 {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        String word1, word2;

        System.out.print("文字列を入力してください: ");
        word1 = keyBoardScanner.next();
        System.out.print("文字列を入力してください: ");
        word2 = keyBoardScanner.next();

        if(word1.equals(word2)){
            System.out.printf("%sと%sは等しい\n", word1, word2);
        }else {
            System.out.printf("%sと%sは等しくない\n", word1, word2);
        }

        keyBoardScanner.close();
    }
}
