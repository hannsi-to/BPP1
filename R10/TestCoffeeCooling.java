/**
 * クラスのテストプログラム
 * ※このファイルは編集しないこと
 */
public class TestCoffeeCooling {
public static void main(String[] args) {
        coffeeCooling cc = new coffeeCooling(10); // 展開項数10で初期化
 
        double T0   = 90.0;  // コーヒーの初期温度（℃）
        double Tenv = 25.0;  // 室温（℃）
        double k    = 0.03;  // 冷めやすさの係数（/分）
 
        // ---- 淹れて5分後 ----
        System.out.println("*** Test1 ***");
        double t1 = 5.0;
        double result1 = cc.predict(T0, Tenv, k, t1);
        System.out.printf("[%.0f分後] コーヒーの温度：%.4f℃（%d項）\n", t1, result1, cc.getN());
 
        // ---- 淹れて15分後 ----
        System.out.println("*** Test2 ***");
        double t2 = 15.0;
        double result2 = cc.predict(T0, Tenv, k, t2);
        System.out.printf("[%.0f分後] コーヒーの温度：%.4f℃（%d項）\n", t2, result2, cc.getN());
 
        // ---- 淹れて30分後 ----
        System.out.println("*** Test3 ***");
        double t3 = 30.0;
        double result3 = cc.predict(T0, Tenv, k, t3);
        System.out.printf("[%.0f分後] コーヒーの温度：%.4f℃（%d項）\n", t3, result3, cc.getN());
    }
}
