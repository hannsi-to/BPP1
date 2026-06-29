/*
    提出者 : 26-9999 近大太郎（各自変更）
    課題番号 : 10-3
    提出日 : 2026/6/16（各自変更）
*/
public class coffeeCooling{
   /* Feild */
   private int n; //展開項数nを表すフィールド変数を宣言する

    /** 【手順1】
     * コンストラクタ：引数で受け取った値をフィールドnに代入する
     */
    public coffeeCooling(int n) {
        /* フィールドに値を代入 */
        /** ここにコードを書く **/
        this.n = n;
    }

    /** 【手順2】
     * Getterメソッド：現在の展開項数nを返す
     */
    public int getN() {
       /* nフィールドの値を返す */
		/** ここにコードを書く **/
        return n;
	}

    /** 【手順3】
     * Setterメソッド：展開項数nを新しい値に変更する
     */
    public void setN(int n) {
       /* nフィールドの値を更新する */
		/** ここにコードを書く **/
        this.n = n;
	}

    /**
     * 【手順4】
     * 熱いコーヒーの温度をニュートンの冷却法則で予測するメソッド
     * T(t) = Tenv + (T0 - Tenv) * exp(-k * t)
     *   T0   : コーヒーの初期温度（例：90℃）
     *   Tenv : 室温（例：25℃）
     *   k    : 冷めやすさの係数（例：0.03 /分）
     *   t    : 経過時間（単位：分）
     * 方針：
     * (1) kとtをかけて kt を求める
     * (2) sum を0で初期化し、展開項を1つずつ足す（外側ループ）
     * (3) 各項の階乗を内側ループで計算する（二重ループ）
     * (4) 最後に Tenv + (T0 - Tenv) * sum を返す
     */
    public double predict(double T0, double Tenv, double k, double t) {
        double sum = 0.0;
        double kt = k * t;

        // 【手順4-1】マクローリン展開の外側ループ:項を加算（for文）
        //  ヒント：指数関数 exp(-kt) の近似値を、0〜(n-1)項目まで(i<n)計算して合計する
        // 【手順4-1-1】階乗を計算する内側ループ: long factorial = 1;（for文）
        //  ヒント：階乗は整数なので long 型を使う（例: 3! = 1×2×3 = 6）
        // 【手順4-1-2】(-kt)^i を計算
        //  ヒント：実数の累乗になるので、double 型を使う　初期値1.0から乗算（double power = 1.0;）
        // 【手順4-1-3】sumに項を加算（term = power / factorial を計算し、sum に返す）
        // 【手順4-2】室温と温度差を使って温度を返す（T(t) = Tenv + (T0 - Tenv) * sum
        
        /** ここにコードを書く **/
        double term = 1.0;
        for (int i = 0; i < n; i++) {
            sum += term;
            term *= (-kt) / (i + 1);
        }

        return Tenv + (T0 - Tenv) * sum;
    }
}
    