/*
    提出者 : 26-9999 近大太郎（各自変更）
    課題番号 : 10-2
    提出日 : 2026/6/16（各自変更）
*/
public class investment {
	/* Feild */
	private int initValue; // 初期資産額を保存するフィールド
	private double interest; // 年利（％）を保存するフィールド

	/* 【手順1】
	Constructor */
	public investment( int initValue, double interest ) {
		/* フィールドに値を代入 */
		/** ここにコードを書く **/
		this.initValue = initValue;
		this.interest = interest;
	}

	/* 【手順2】
	Getter */
	public int getInitValue() {
		/* InitValueフィールドの値を返す */
		/** ここにコードを書く **/
		return initValue;
	}

	public double getInterest() {
		/* Interestフィールドの値を返す */
		/** ここにコードを書く **/
		return interest;
	}


	/** 【手順3】
	n年後の資産額を計算して結果を返すメソッド
	1年後の資産は年利（float型）に基づいて計算するが，金額は切り捨ててint型とする．
	（例）資産 1,100円 年利 2.5% の場合，1100 x (1+0.025) = 1127.5 = 1,127円
	@para n n年後の資産を計算する
	@return n年後の資産額
	*/
	public int calcValue(int n) {
		int value = this.initValue; // 戻り値を入れる変数，便宜的に0で初期化
		
		//【手順3-1】 ループカウンターiを0からnまで繰り返す（for文）
		//【手順3-2】 ループの中で複利計算を実行する
		//				ヒント　小数点以下は切り捨てる

		/** ここにコードを書く **/
		for (int i = 0; i < n; i++) {
			value = (int)(value * (1 + this.interest / 100.0));
		}

		return (int)value; /* 結果を返す */
	}

	/** 【手順4】
	資産が目標額に達する年数を計算する
	初期資産が初めから目標額を超えている場合は0を返す
	@param goal 目標額
	@return 目標額を超えるのに必要な年数
	*/	
	public int calcYears(int goal) {
		int years = 0; /* 戻り値．0で初期化 */
		int value = this.initValue;
		//【手順4-1】 while文を使って条件を満たすまでループ
		// 			  ヒント value < goal
		//【手順4-2】資産の更新（利率をかける）
		//			  ヒント1 this.interest は %（パーセント）なので、100で割って実数にする
		//			  ヒント2 資産は整数、小数点以下は切り捨てる
		//【手順4-3】1年ごとにカウント（years++)

		/** ここにコードを書く **/
		while (value < goal) {
			years++;
			value = calcValue(years);
		}

		return years;
	}
}