public class Discount {
    private int price;//定価

    /**
     * コンストラクター
     * @param price 定価
     */
    public Discount(int price) {
        this.price = price;
    }

    /**
     * 割引後の値段を計算
     * @param ratePercent 割引率
     * @return 割引の値段
     */
    public int calc(int ratePercent) {
        return (int) ((1.0 - (double)(ratePercent / 100.0)) * price);
    }

    public static void main(String[] args) {
        //Discountオブジェクトの作成
        Discount discount = new Discount(12800);
        System.out.print("12800円の商品\n");
        System.out.printf("33パーセント引きは%d円です\n",discount.calc(33));
        System.out.printf("65パーセント引きは%d円です\n",discount.calc(65));

        //Discountオブジェクトの再生成
        discount = new Discount(32000);
        System.out.print("32000円の商品\n");
        System.out.printf("33パーセント引きは%d円です\n",discount.calc(12));
        System.out.printf("65パーセント引きは%d円です\n",discount.calc(28));
    }
}
