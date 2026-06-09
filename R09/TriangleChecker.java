/*
    提出者 : 26-0248 小川皓（各自変更）
    課題番号：9-2
    提出日：2026/6/09（各自変更）
*/

public class TriangleChecker {
    /* Field */
    private int a;  // 辺 a の長さ
    private int b;  // 辺 b の長さ
    private int c;  // 辺 c の長さ

    /* 【課題9-2 手順1】
    Constructor */
    public TriangleChecker(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* 【課題9-2 手順2】
    Getter */
    public int getA() {
        /* a の値を返す */
        return a;
    }
    public int getB() {
        /* b の値を返す */
        return b;
    }
    public int getC() {
//      /* c の値を返す */
        return c;
    }
//
//    /* 【課題9-2 手順3】 三角形成立判定 */
    public boolean isTriangle() {
//        /* 成立条件
//        - a + b > c かつ a + c > b かつ b + c > a を判定して結果を返す */

        return a + b > c && a + c > b && b + c > a;
    }
//
//    /* 【課題9-2 手順4】 種類判定 */
    public String getType() {
//        /** isTriangle() が true の前提で:
//         - a == b かつ b == c -> "正三角形"
//         - a == b または b == c または a == c -> "二等辺三角形"
//         - それ以外 -> "不等辺三角形" */

        if(isTriangle()) {
            if(a == b && b == c){
                return "正三角形";
            }else if(a == b || b == c || a == c){
                return "二等辺三角形";
            }else{
                return "不等辺三角形";
            }
        }else {
            return "三角形ではありません。";
        }
    }

//    /* 【課題9-2 手順5】 結果表示 */
    public void showResult() {
//        /**
//         (1) a b c の値を出力
//         (2) isTriangle() による成立判定
//           - false: "三角形ではありません" を出力
//           - true: "三角形です" を出力
//             続けて getType() + "です" を出力　*/

        System.out.println(a + " " + b + " " + c);
        if(isTriangle()) {
            System.out.println("三角形です");
            System.out.println(getType() + "です");
        }else{
            System.out.println("三角形ではありません");
        }
    }
}
