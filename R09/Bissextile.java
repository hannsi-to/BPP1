/*
    提出者 : 26-9999 近大太郎（各自変更）
    課題番号：9-1
    提出日：2026/6/09（各自変更）
*/

public class Bissextile {
    /* Feild */
    private int year; // うるう年判定をする西暦年を保存するフィールド

    /* 【課題9-1 手順1】
    Constructor */
    public Bissextile( int year ) {
        /* フィールドに値を代入 */
        this.year = year;
    }

    /* 【課題9-1 手順2】
    Getter */
    public int GetYear() {
        /* yearフィールドの値を返す */
        return year;
    }

    /** 【課題9-1 手順3】
     うるう年かどうかの判定
     @return true うるう年である, false うるう年ではない
     */
    public boolean isBissextile() {
        Boolean retv = false; // 戻り値を入れる変数．falseで初期化

		/* 方針
		(1) 4で割り切れるかどうかを確認する（if文）
		(2) 4で割れる場合，100で割り切れ，かつ400で割り切れない場合を除いてうるう年とする
		    ヒント：(a && b)「aかつb」，!(a && b)「（aかつb）ではない」
		*/
        if(year % 4 == 0) {
            if(!(year % 100 == 0 && year % 400 != 0)){
                retv = true;
            }
        }

        return retv; /* 結果を返す */
    }

    /** 【課題9-1 手順4】
     結果を画面（ターミナル）に表示する
     */
    public void showResult() {
        System.out.print(GetYear()+"年は");

		/*
		うるう年かどうかを判定し，適切なメッセージを表示させる．
		判定にはisBissextileメソッドを利用すること．
		表示させるメッセージ（コピーして利用すること）
		うるう年の場合：うるう年です
		うるう年では無い場合：うるう年ではありません
		*/
        System.out.println(isBissextile() ? "うるう年です" : "うるう年ではありません");
    }
}
