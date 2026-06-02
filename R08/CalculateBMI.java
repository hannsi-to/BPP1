import java.util.Scanner;

public class CalculateBMI {
    private int height;//身長
    private int weight;//体重
    private double bmi;//BMI
    private double properWeight;//適正体重

    /**
     * コンストラクター
     * @param height 身長
     * @param weight 体重
     */
    public CalculateBMI(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    /**
     * 身長、体重を元にBMI、適正体重を計算
     */
    public void calculate() {
        double heightM = height / 100.0;
        bmi = weight / (heightM * heightM);
        properWeight = heightM * heightM * 22;
    }

    /**
     * 結果を表示
     */
    public void showResult() {
        System.out.printf("あなたのBMI値は %4.1fです \n",bmi);
        System.out.printf("あなたの適正体重は %4.1fkgです \n",properWeight);
    }

    public static void main(String[] args) {
        //Scannerオブジェクトを作成
        Scanner keyBoardScanner = new Scanner(System.in);

        //入力処理
        System.out.print("身長(cm)を入力してください(int): ");
        int height = keyBoardScanner.nextInt();
        System.out.print("体重(kg)を入力してください(int): ");
        int weight = keyBoardScanner.nextInt();

        keyBoardScanner.close();

        //CalculateBMIオブジェクトを作成
        CalculateBMI bmi1 = new CalculateBMI(height, weight);
        bmi1.calculate();
        bmi1.showResult();
    }
}
