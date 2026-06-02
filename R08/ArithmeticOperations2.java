import java.util.Scanner;

public class ArithmeticOperations2 {
    private int operand1;//値１
    private int operand2;//値２

    /**
     * コンストラクター
     * @param operand1 値１
     * @param operand2 値２
     */
    public ArithmeticOperations2(int operand1, int operand2) {
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

    public static void main(String[] args) {
        //Scannerオブジェクトを作成
        Scanner keyboardScanner = new Scanner(System.in);

        //入力処理
        System.out.print("一つ目の整数を入力してください: ");
        int input1 = keyboardScanner.nextInt();
        System.out.print("二つ目の整数を入力してください: ");
        int input2 = keyboardScanner.nextInt();

        //ArithmeticOperations2オブジェクトの作成
        ArithmeticOperations2 arithmeticOperations = new ArithmeticOperations2(input1,input2);
        int addResult = arithmeticOperations.calcSum();
        System.out.printf("和を表示します\n%d",addResult);

        keyboardScanner.close();
    }
}
