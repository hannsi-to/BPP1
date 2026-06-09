/*
    提出者 : 26-0248 小川皓（各自変更）
    課題番号：9-3
    提出日：2026/6/09（各自変更）

    内容：金額、人数、端数処理の方針を元に、割り勘金額を計算し表示するプログラム。
*/

public class SplitBill {
    /* Field */
    int total;         // 合計金額（円）
    int people;        // 人数
    boolean isExact;   // trueなら端数まで、falseなら100円単位で切り上げ

    /** 【課題9-3 手順1】
        Constructor
    */
    public SplitBill(int total, int people, boolean isExact) {
        /*
        (1) 引数totalをtotalフィールドに代入する
        (2) 引数peopleをpeopleフィールドに代入する
        (3) 引数isExactをisExactフィールドに代入する
        */

        this.total = total;
        this.people = people;
        this.isExact = isExact;
    }

    /** 【課題9-3 手順2】
        割り勘結果を表示するメソッド。
        端数処理の方法に応じて、計算内容を分けて表示する。
    */
    public void showResult() {
        double perPerson; // 1人あたりの金額

        // 【課題9-3 手順2-1】
        // isExactがtrueの場合、端数まで正確に割り勘する
        if (isExact) {
            /*
            (1) isExactがtrueの場合という条件式をif()に書く
            (2) perPersonに「total ÷ people」の結果を代入
            (3) System.out.printfを使って、小数第2位まで表示する
		ヒント：System.out.printf("1人あたり：%d 円です（端数まで）\n", total);
		このままだと要件を満たさないので、適切な箇所を要件を満たすように編集すること
            */

            perPerson = (double) total / (double) people;
            System.out.printf("1人あたり：%8.2f 円です（端数まで）\n", perPerson);
        } else {
            double payTotal;
            double extra;
        /*　【課題9-3 手順2-2】
            isExactがfalseの場合、100円単位で切り上げた金額にして割り勘する*/
            /*
            (1) perPersonに「100円単位で切り上げた金額」を代入
                // total ÷ people をまず double型で計算して正確な1人分の金額を求める
                // → それを 100 で割って何百円分かにしてから、切り上げ（Math.ceil）
                // → 100をかけて「100円単位」に戻す
                // → 最後に (int) で整数として代入（例：262.5 → 300）
                // ※ (int) への型変換は、出力時（System.out.printf）で行う（下記に記述済み)
                ヒント：Math.ceil((double)total / people / 100) * 100
            (2) 集めた合計金額（payTotal）を求める
            (3) 余った金額（extra）を求める
            (4) 1人あたり・合計・余剰金を出力する
                ヒント：System.out.printfを使う(下記に記述済み)
            */

            perPerson = Math.ceil((double) total / (double) people / 100d) * 100;
            payTotal = perPerson * people;
            extra = payTotal -total;

            System.out.printf("1人あたり：%.0f 円です（100円単位）\n", perPerson);
            System.out.printf("集めた合計：%d 円\n", (int)payTotal);
            System.out.printf("余ったお金：%d 円（じゃんけん？）\n", (int)extra);
        }

    }
}

