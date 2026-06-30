/*
    提出者 : YY-NNNN 近大太郎（各自変更）
    課題番号 : 12-2
    提出日 : 202X/X/XX（各自変更）
*/

import java.util.Scanner;
/**
 * 文字列操作のクラス
 * StringOperations
 */
public class StringOperations {
    private String str1, str2;
    /**
     *  コンストラクタ 
     */
    public StringOperations(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    /**
     * strAstStr メソッド
     * 文字列1(str1)と文字列2(str2)の間をnum個の'*'で連結した結果をstr12に格納し，戻り値として返す．
     * 
     * @param  num   '*'の個数
     * @retuen str12 連結結果の文字列
     */
    public String strAstStr(int num){
        String str12 = null; // 連結した結果を格納するための文字列
        //【手順1-1】str12 に str1 をセットする．
        str12 = str1;
     
        //【手順1-2】num個の'*'を str12 に連結する．
        //          ヒント: '*'を繰り返し追加(for文)
        for (int i = 0; i < num; i++) {
            str12 += "*";
        }

        //【手順1-3】str12 に str2 を連結する．
        str12 += str2;

        return(str12);
    }
    /**
     * compString_n メソッド
     * 文字列1(str1)と文字列2(str2)の先頭からnum番目以降の文字列が一致するか否か調べる．
     * ただし，先頭を1番目とする
     * 
     * flg =  0  (一致しない場合)
     * flg =  1  (一致する場合)
     * flg = -1 （numの値が不適切[負の値 or str1,str2の文字数より大きい]のため比較できない場合）
     * 
     * @param num 
     * @return flg
     */
    public int compString_n(int num){
        int flg = 0;
        String str1N, str2N; // str1 および str2 それぞれのnum番目以降の文字列
 
        //【手順2-1】
        // 文字列比較を行う場合の num の条件を if 文で記述
        // if(num が 1以上であり, かつ str1 と str2 の両方が num 文字以上あるとき)
        // if( ){
        
            // 【手順2-2】文字列1(str1)と文字列2(str2)の先頭からnum番目以降の文字列をそれぞれ str1N, str2N に代入
            // substring(n) は「n文字目以降の部分」を取り出す
            // num 番目の指定に注意
            // 例：str1 = "abcde", num = 3 → str1N = "cde"になってほしい
            

            //【手順2-3】もし，str1N と str2N が一致すれば，flg = 1. 
            // equals()を使う 

        //} 
        // 【手順2-4】num の値が不適切な場合のflag値をelse文で記述.
        // flg = -1 を返す
        // else { };

        if(num >= 1 && str1.length() >= num && str2.length() >= num){
            str1N = str1.substring(num, str1.length() - 1);
            str2N = str2.substring(num, str2.length() - 1);

            if(str1N.equals(str2N)){
                flg = 1;
            }
        } else{
            flg = -1;
        }

        return(flg);
    }
    /**
     * show_iChar メソッド
     * 引数で与えられる文字列 str に対して，以下の処理を行う．
     *  ・文字数を表示
     *  ・一文字ずつ改行して表示
     * 
     * @param  str 文字列
     */
    public void show_iChar(String str){
        //【手順3-1】文字列の長さを表示する
        // str.length()を使う
        // "文字列「◻︎」は◻︎文字です\n" ◻︎を埋めて, 代入する引数を記述
        System.out.printf("文字列「%s」は%s︎文字です\n",str,str.length());

        for(int i=0;i<str.length();i++){
        //【手順3-2】
        //      strを一文字ずつ改行して「○文字目: △」の形式で表示する．
        //      （ただし，◯はint型 3桁表示, △はchar型 1文字 とする．）

            System.out.printf("%s文字目: %s\n",i,str.charAt(i));
        }
    }
    /** 
     * int2String メソッド 
     * int型のnumをString型に変換してstrに格納し，その値を返す．
     * 
     * @param num 
     * @return str
     */
    public String int2String(int num){
        String str = null;
        //【課題3-3】
        // int型のnumをString型に変換してstrに格納する．（value0fメソッドを使う）

        str = String.valueOf(num);

        return(str);
    }
    /**
     * メイン メソッド
     */
    public static void main(String[] args) {
        int oprNum, num;
        String str1, str2;

        Scanner keyBoardScanner = new Scanner(System.in); //文字操作メニューを表示
        System.out.println("文字列1と文字列2をnum(int)個の'*'で連結                    ---> 1");
        System.out.println("文字列1と文字列2の先頭からnum(int)文字目以降の文字列を比較 ---> 2");
        System.out.println("num(int)を文字列に変換し、文字列1と文字列2の間に挟んで連結 ---> 3");

        System.out.print("操作番号(int)を入力してください：");
        oprNum = keyBoardScanner.nextInt();  // キーボードから操作番号(int)を入力

        if((oprNum > 0) && (oprNum < 4)){
            System.out.print("文字列1(String)を入力してください：");
            str1 = keyBoardScanner.next();    // キーボードから文字列1(String)を入力
            System.out.print("文字列2(String)を入力してください：");
            str2 = keyBoardScanner.next();    // キーボードから文字列2(String)を入力
            System.out.print("整数(int)を入力してください：");
            num = keyBoardScanner.nextInt();  // キーボードから整数(int)を入力

            //str1,str2を引数として与えて，StringOperations型のオブジェクトを生成
            StringOperations stringOpr = new StringOperations(str1, str2);
        
            switch(oprNum){
                case 1: //【手順1】文字列の連結 str1 **....*** str2
                    System.out.printf("%s\n",stringOpr.strAstStr(num));
                    break;
                case 2: //【手順2】num(int)番目以降のstr1とstr2の一致を調べる
                    int flg = stringOpr.compString_n(num);
                    if (flg==1)     System.out.println("一致します");
                    else if(flg==0) System.out.println("一致しません");
                    else            System.out.println("比較できません");
                    break;
                case 3: //【手順3】整数num(int型)を文字列num(String型)に変換し, 表示する
                    String tmpStr = stringOpr.int2String(num); 
                    System.out.printf("num(int)の値   : %d\n", num);
                    System.out.printf("num(String)の値: %s\n", tmpStr);
                    //【手順3-4】フィールドのstr1 + num(String型) + フィールドのstr2 の形に連結してtmpStrに格する．
                    tmpStr = str1 + tmpStr + str2;

                    //【手順3-5】show_iCharメソッドを使って，tmpStrを1文字ずつ改行して表示する.
                    stringOpr.show_iChar(tmpStr);

                    break;
            }
        } else{
            System.out.println("操作番号が正しくありません");
        }
        keyBoardScanner.close();
    }
}