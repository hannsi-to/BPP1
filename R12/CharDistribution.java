/*
    提出者 : YY-NNNN 近大太郎（各自変更）
    課題番号 : 12-3
    提出日 : 202X/X/XX（各自変更）
*/
import java.util.Scanner;
/**
 * 文字列中に現れる文字の出現頻度を表示するクラス
 * CharDistribution
 */
public class CharDistribution{
    private String alphabets = "abcdefghijklmnopqrstuvwxyz"; // 小文字アルファベットの文字列
    private String text;                                     //入力文字列

    /** 
     * コンストラクタ
     * @param text 入力文字列（文字列）
     */
    public CharDistribution(String text){
        //【手順1】引数のtextをフィールドのtextにセットする．
        /** ここにコードを書く **/

        this.text = text;
    }
    /*
     * 度数分布作成メソッド
     * 文字列(text）に現れるアルファベット（小文字26個）の出現頻度を表示する．
    */
    public void countChar(){ 
        String current; // フィールドの text から取り出した1文字を文字列として一時的に格納しておく変数
        int count;      // current の文字がフィールドのtextの中に何回現れたかを記録しておく変数

	//【手順2】2重ループで実装
    //【手順2-1】外側ループ：alphabets に含まれる文字を 1文字ずつ取り出す※1
    //【手順2-1-1】count  を0に初期化
    //【手順2-2】内側ループ：text に含まれる文字を 1文字ずつ取り出す
    //【手順2-2-1】textのj文字目をString型に変換してcurrentに代入
    //          String.valueOf()を使用して, String型にする
    //【手順2-2-2】currentとalphabetsのi番目の文字（1文字）を比較し, 一致したらカウントを1増やす
    //          ヒント1: 両方をString型にして .equals() で中身が同じかどうかを判定 
    //          ヒント2: 一致したらカウントを増やすというif文を記述
    //【手順2-3】出現頻度を表示する．
    //          ヒント1:カウントが0でない（count = 0）場合のみ, 出現頻度を表示する
    //          ヒント2:System.out.printf("◻︎の出現頻度 = ◻︎\n", ◻︎, ◻︎);  ◻︎を埋める
    //      
    /** ここにコードを書く **/
        for (int i = 0; i < alphabets.length(); i++) {
            String alphabet = String.valueOf(alphabets.charAt(i));
            count = 0;
            for (int j = 0; j < text.length(); j++) {
                current = String.valueOf(text.charAt(j));
                if(current.equals(alphabet)){
                    count++;
                }
            }

            if(count != 0){
                System.out.printf("%sの出現頻度 = %s\n", alphabet, count);
            }
        }

    }
    /**
     * メインメソッド
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        String text;
        // Scanner クラスのオブジェクト生成　キーボード入力を読み取る準備
        Scanner keyBoardScanner = new Scanner(System.in);
        // 文字列を入力
        System.out.print("文字列を入力してください：");
        text = keyBoardScanner.nextLine();
        // 入力された文字列を表示する
        System.out.printf("入力文字列：%s\n", text);

        System.out.println("文字出現頻度分布：");
        // CharDistributionオブジェクトを生成
        CharDistribution Dist = new CharDistribution(text);
        // 文字列中の文字の出現回数をcountCharメソッドでカウント・表示
        Dist.countChar();
        keyBoardScanner.close();
    }
}
