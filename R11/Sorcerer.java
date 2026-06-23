/*
 * 提出者 26-1-211-0248 小川皓
 * 課題11-0
 * 提出日 2026/6/23
 */

/**
 * 魔術師を表すクラス
 * 各魔術師は名前，魔力，抵抗力をフィールドとして持つ
 */
public class Sorcerer {
	private String name; // 名前
	private int power;   // 魔力
	private int resist;  // 抵抗力

	/**
	 * コンストラクタ
	 * 引数で受け取った値をフィールドに代入する
	 * @param name : 名前
	 * @param power : 魔力
	 * @param resist : 抵抗力
	 */
	public Sorcerer (String name, int power, int resist) {
		// 各フィールドの値を設定する
		this.name = name;
		this.power = power;
		this.resist = resist;
	}

	/**
	 * 名前を表示する
	 * 例えば名前が「ハーマイオニー」なら「私の名前はハーマイオニーです．」と表示する
	 */
	public void showName() {
		// 「私の名前は（名前）です．」と表示する
		System.out.println("私の名前は" + name + "です．");
	}

	/**
	 * 状態を表示する
	 * 例えば魔力が10，抵抗力が15なら，「魔力が10で，抵抗力が15です．」と表示する
	 */
	public void showState() {
		// 「魔力が（魔力）で，抵抗力が（抵抗力）です．」と表示する
		System.out.println("魔力が" + power + "で，抵抗力が" + resist + "です．");
	}

	/**
	 * 引数で挨拶相手の名前を受け取り，相手に挨拶する
	 * 「（引数）さん，おはようございます．」と表示する
	 * @param to : 挨拶する相手の名前
	 */
	public void greeting (String to) {
		// 「（引数）さん，おはようございます．」と表示する
		System.out.println(to + "さん，おはようございます．");
	}

	/**
	 * 引数で挨拶相手を受け取り，相手に挨拶する
	 * 「（引数の名前）さん，こんにちは．」と表示する
	 * @param to : 挨拶する相手
	 */
	public void greeting (Sorcerer to) {
		//「（引数の名前）さん，こんにちは．」と表示する
		System.out.println(to.getName() + "さん，こんにちは．");
	}

	/**
	 * power フィールドのセッター
	 * 引数で受け取った値を魔力に設定する
	 * (今回の課題ではこのメソッドは必要ありませんが余裕があれば作成してください)
	 * @param power : 設定する魔力
	 */
	public void setPower (int power) {
		// 魔力を設定する
		this.power = power;
	}

	/**
	 * power フィールドのゲッター
	 * (今回の課題ではこのメソッドは必要ありませんが余裕があれば作成してください)
	 * @return 魔力の値
	 */
	public int getPower() {
		return power; // 魔力を返す
	}

	/**
	 * resist フィールドのセッター
	 * 引数で受け取った値を抵抗力に設定する
	 * @param resist : 設定する抵抗力
	 */
	public void setResist (int resist) {
		// 抵抗力を設定する
		this.resist = resist;
	}

	/**
	 * resist フィールドのゲッター
	 * @return 抵抗力の値
	 */
	public int getResist() {
		return resist; // 抵抗力を返す
	}

	/**
	 * name フィールドのセッター
	 * 引数で受け取った値を名前に設定する
	 * (今回の課題ではこのメソッドは必要ありませんが余裕があれば作成してください)
	 * @param name : 設定する名前
	 */
	public void setName (String name) {
		// 名前を設定する
		this.name = name;
	}

	/**
	 * name フィールドのゲッター
	 * @return 名前
	 */
	public String getName() {
		return name; // 名前を返す
	}

	/**
	 * 魔力を増幅する
	 * （引数で指定された値）％分魔力を増幅する
	 * 引数が 負の値の場合は「魔力消失！」，正の値の場合は「魔力覚醒！」と表示し，魔力の値を変化させる
	 * 引数が 0 の場合は「魔力安定！」と表示し魔力の値は変化させない
	 *
	 * 例えば引数が 50 なら，「魔力覚醒！」と表示し魔力を 1.50 倍(端数切り捨て)にする
	 * 引数が -30 なら,「魔力消失！」と表示し魔力を 0.70 倍(端数切り捨て)にする
	 *
	 * @param rate : 増幅する割合
	 * @return 自分自身
	 */
	public Sorcerer enhance (int rate) {
		// 引数が 負の値なら「魔力消失！」， 正の値なら「魔力覚醒！」，0 なら「魔力安定！」と表示する
		// 魔力を（引数の値）％分増減(端数切捨て)する

		if(rate == 0){
			System.out.println("魔力安定！");
		}else if(rate > 0) {
			System.out.println("魔力覚醒！");
		}else {
			System.out.println("魔力消失！");
		}

		power = (int) (power + (power * (rate / 100.0)));

        return this; // 自分自身を返す
	}

	/**
	 * 引数で指定された攻撃対象に攻撃する
	 * （自分の魔力 - 攻撃対象の抵抗力）のダメージを与える．
	 * ダメージが 1 以上の場合は与えたダメージを表示し，ダメージが 0 以下の場合は「ダメージを与えられない！」と表示する
	 *
	 * 例えば，自分が名前「ハリー」で魔力 20，攻撃対象の名前が「ヴォルデモート」で抵抗力が 99 なら
	 * 「ハリーの攻撃！ヴォルデモートにダメージを与えられない！」と表示する
	 * 同様に，自分が名前「ダンブルドア」で魔力 100，攻撃対象の名前が「ヴォルデモート」で抵抗力が 99 なら
	 * 「ダンブルドアの攻撃！ヴォルデモートに1のダメージ！」と表示する
	 *
	 * @param opponent : 攻撃対象
	 */
	public void attackTo (Sorcerer opponent) {
		// ダメージ値を（自分の魔力 - 攻撃対象の抵抗力）とする
		// 「（自分の名前）の攻撃！」と表示する
		// ダメージが 1 以上ならば「（攻撃対象の名前）に（ダメージ）のダメージ！」と表示する
		// ダメージが 0 以下ならば「（攻撃対象の名前）にダメージを与えられない！」と表示する

		int damage = this.power - opponent.getResist();
		System.out.print(this.name + "の攻撃！");
		if(damage >= 1){
			System.out.println(opponent.getName() + "に" + damage + "のダメージ！");
		}else {
			System.out.println(opponent.getName() + "にダメージを与えられない！");
		}
	}
}