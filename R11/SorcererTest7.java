/*
 * 提出者 26-1-211-0248 小川皓
 * 課題11-7
 * 提出日 2026/6/23
 */

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを2つ生成後，一方の魔術師がもう一方に攻撃する
 */
public class SorcererTest7 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// 名前「ハリー」，魔力11，抵抗力12で魔術師1のオブジェクトを生成する
		// showName() で魔術師1の名前を表示する
		// showState() で魔術師1の状態を表示する

		// 名前「ドラコ」，魔力13，抵抗力20で魔術師2のオブジェクトを生成する
		// showName() で魔術師2の名前を表示する
		// showState() で魔術師2の状態を表示する

		// attackTo (Sorcerer) で魔術師1が魔術師2に攻撃する

		// enhance (int) で魔術師1の魔力を150％増減する

		// attackTo (Sorcerer) で魔術師1が魔術師2に攻撃する

		Sorcerer sorcerer1 = new Sorcerer("ハリー",11,12);
		sorcerer1.showName();
		sorcerer1.showState();

		Sorcerer sorcerer2 = new Sorcerer("ドラコ",13,20);
		sorcerer2.showName();
		sorcerer2.showState();

		sorcerer1.attackTo(sorcerer2);

		sorcerer1.enhance(150);

		sorcerer1.attackTo(sorcerer2);
	}
}
