/**
 * Caclクラスの動作検証用のクラス
 */
public class CalcTest {
	public static void main (String[] args) {
		Calc calc1 = new Calc();
		int result = calc1.calcSum(1, 5);
		System.out.println("結果は" + result);
	}
}
