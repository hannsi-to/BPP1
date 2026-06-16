/*
    提出者 : 26-0248 小川皓（各自変更）
    課題番号 : 10-1
    提出日 : 2026/6/16（各自変更）
*/


import static java.lang.Math.pow;

public class virusSim {
  /* Feild */
    private int k; // 感染力（1人が1日に感染させる人数）
    private int threshold; // 感染者数の上限（目標値）

    /** 【手順1】コンストラクタ */
    public virusSim(int k, int threshold) {
        /** フィールドに代入 **/
        /** ここにコードを書く **/
        this.k = k;
        this.threshold = threshold;
    }

    /**【手順2】感染シミュレーション */
    public int simulate() {
        int day = 0;       // 日数
        int daily = 1;     // 新規感染者数
        int total = 1;     // 累積感染者数

        // 新規感染者数と累積感染者数を出力し続ける
        //【手順2-1】 day, daily, total を初期化（上記に記載済み)
        //【手順2-2】 感染者の累積数が threshold（上限）を超えるまで繰り返す
        //           ヒント：while (total <= threshold) で繰り返す
        //【手順2-3】 日数を1日進める
        //【手順2-4】 新規感染者数 daily を初期化 daily = 1;
        //【手順2-5】 内側ループ k^day を繰り返し、乗算をfor文で求める
        //           例：k=2, day=3 の場合 → daily = 2 × 2 × 2 = 8
        //           i = 0 から day 未満まで、k を day 回掛け合わせればよい
        //【手順2-6】 当日の新規感染者数を累積感染者数に加算
        
        /** ここに繰り返し構文を書く **/
        while (total <= threshold) {
            day++;

            daily = 1;
            int power = k;
            for (int i = 1; i < day; i++) {
                power *= k;
            }
            daily = power;
            total += daily;
        }
                
        return day; // 感染者がthresholdを超えた時点の日数を返す
    }
}
