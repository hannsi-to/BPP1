/*
    提出者 : YY-NNNN 近大太郎（各自変更）
    課題番号 : 12-1
    提出日 : 202X/X/XX（各自変更）
*/

import java.util.Scanner;
/**
 * 文字列置換のクラス
 * ReplaceText
 */
public class ReplaceText{
    public static void main(String[] args) {
        String text = null;     // 入力文字列 
        String oldWord = null;  // 置換前文字列
        String newWord = null ;  // 置換後文字列
        Scanner keyBoardScanner = new Scanner(System.in);
        //【手順1】"テキストを入力してください："と表示させ, textにキーボードから入力した文字列を代入.
        // カッコの中身（　）を空白にしてあります. 全角スペースなどが含まれていないかしっかり確認してください. 
        System.out.print("テキストを入力してください：");
        text = keyBoardScanner.nextLine();
        
        //【手順2】"置換したい文字列（old）を入力してください："と表示させ, oldWord にキーボードから入力した文字列を代入.
        // カッコの中身（　）を空白にしてあります. 全角スペースなどが含まれていないかしっかり確認してください. 
        System.out.print("置換したい文字列（old）を入力してください：");
        oldWord = keyBoardScanner.nextLine();
        
        //【手順3】"置換したい文字列（new）を入力してください："と表示させ, newWordにキーボードから入力した文字列を代入.
        // カッコの中身（　）を空白にしてあります. 全角スペースなどが含まれていないかしっかり確認してください. 
        System.out.print("置換したい文字列（new）を入力してください：");
        newWord = keyBoardScanner.nextLine();
        
        //【手順4】置換前の文字列を表示する("置換前の文字列：文字列を出力する指定子+改行", 引数);
        // カッコの部分", ）"に空白があります. 全角スペースなどが含まれていないかしっかり確認してください.
        System.out.printf("置換前の文字列：%s\n",text);
        
        //【手順5】replaceメソッドを使ってoldWordをnewWordに置換した文字列をtextに代入
        text = text.replace(oldWord,newWord);
        
        //【手順6】置換後の文字列を表示する("置換後の文字列：文字列を出力する指定子+改行", 引数);
        System.out.printf("置換後の文字列：%s\n", text);

        keyBoardScanner.close();
    }
}
