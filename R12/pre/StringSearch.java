package pre;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        int position;
        String word1, word2;

        System.out.print("文字列を入力してください: ");
        word1 = keyBoardScanner.next();
        System.out.print("文字列を入力してください: ");
        word2 = keyBoardScanner.next();

        if((position = word1.indexOf(word2)) >= 0) {
            System.out.printf("%sの%d文字目に%sが現れる",word1,++position,word2);
        }else{
            System.out.printf("%sは%sに現れない",word2,word1);
        }
        keyBoardScanner.close();
    }
}
