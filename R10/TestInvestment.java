/**
	Investmentクラスのテスト用プログラムです．
	このファイルは編集しないこと！！！
*/

public class TestInvestment {
    public static void main(String[] args) {

	System.out.println("*** Test1 ***");	
	investment inv1 = new investment(1100,2.5);
	System.out.printf("%d円を年利%1.1f％で%d年運用すると%d円になります\n",inv1.getInitValue(),inv1.getInterest(),1,inv1.calcValue(1));
	System.out.printf("%d円を年利%1.1f％で%d年運用すると%d円になります\n",inv1.getInitValue(),inv1.getInterest(),5,inv1.calcValue(5));

	System.out.println("*** Test2 ***");
	int goal = 1500;
	System.out.printf("%d円を年利%1.1f％で運用すると%d年後に%d円を超えます\n",inv1.getInitValue(),inv1.getInterest(),inv1.calcYears(goal),goal);
	goal = 900;
	System.out.printf("%d円を年利%1.1f％で運用すると%d年後に%d円を超えます\n",inv1.getInitValue(),inv1.getInterest(),inv1.calcYears(goal),goal);

	
    }
}