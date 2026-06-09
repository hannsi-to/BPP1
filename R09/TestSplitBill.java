/**
    SplitBill クラスのテスト用プログラムです。
    このファイルは編集しないこと。
*/


public class TestSplitBill {
    public static void main(String[] args) {
        System.out.println("*** Test1 ***");
        System.out.println("金額：5670円, 人数：4人, 端数まで割り勘");
        SplitBill sb1 = new SplitBill(5670, 4, true);
        sb1.showResult();

        System.out.println("\n*** Test2 ***");
        System.out.println("金額：5670円, 人数：4人, 100円単位で切り上げ");
        SplitBill sb2 = new SplitBill(5670, 4, false);
        sb2.showResult();

        System.out.println("\n*** Test3 ***");
        System.out.println("金額：4000円, 人数：4人, 端数まで割り勘（端数なし）");
        SplitBill sb3 = new SplitBill(4000, 4, true);
        sb3.showResult();

        System.out.println("\n*** Test4 ***");
        System.out.println("金額：35870円, 人数：13人, 100円単位で切り上げ");
        SplitBill sb4 = new SplitBill(35870, 13, false);
        sb4.showResult();
    }
}
