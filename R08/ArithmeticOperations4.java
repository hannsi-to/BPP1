import java.util.Scanner;

public class ArithmeticOperations4 {
    private int operand1;//値１
    private int operand2;//値２

    /**
     * コンストラクター
     * @param operand1 値１
     * @param operand2 値２
     */
    public ArithmeticOperations4(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    /**
     * 合計を計算
     * @return 計算結果
     */
    public int calcSum() {
        return operand1 + operand2;
    }

    /**
     * 二つの値を引き算する
     * @return 計算結果
     */
    public int calcDiff(){
        return operand1 - operand2;
    }

    /**
     * 二つの値を掛け算する
     * @return 計算結果
     */
    public long calcProduct(){
        return (long) operand1 * (long) operand2;
    }

    /**
     * 二つの値を割り算する
     * @return 計算結果
     */
    public double calcQuotient(){
        return (double) operand1 / (double) operand2;
    }

    public static void main(String[] args) {
        //Scannerオブジェクトを作成
        Scanner keyboardScanner = new Scanner(System.in);

        //入力処理
        System.out.print("一つ目の整数を入力してください: ");
        int input1 = keyboardScanner.nextInt();
        System.out.print("二つ目の整数を入力してください: ");
        int input2 = keyboardScanner.nextInt();

        //ArithmeticOperations4オブジェクトの作成
        ArithmeticOperations4 arithmeticOperations = new ArithmeticOperations4(input1,input2);
        System.out.printf(
                "和　差　積　商の順に表示します\n%d %d %d %f",
                arithmeticOperations.calcSum(),
                arithmeticOperations.calcDiff(),
                arithmeticOperations.calcProduct(),
                arithmeticOperations.calcQuotient()
        );

        keyboardScanner.close();
    }
}
