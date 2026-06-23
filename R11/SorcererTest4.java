/*
 * 提出者 26-1-211-0248 小川皓
 * 課題11-4
 * 提出日 2026/6/23
 */

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを生成後，抵抗力を読み込み，抵抗力を再設定する
 */
public class SorcererTest4 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// 名前「ハリー」，魔力11，抵抗力12で魔術師のオブジェクトを生成する
		// showName() で魔術師の名前を表示する
		// showState() で魔術師の状態を表示する

		// getResist() で魔術師の抵抗力を得る
		// 抵抗力を5増やす
		// setResist (int) で魔術師の抵抗力を設定する
		// 「守りの指輪を装備しました．」と表示する
		// showState() で魔術師の状態を表示する

		Sorcerer sorcerer = new Sorcerer("ハリー",11,12);
		sorcerer.showName();
		sorcerer.showState();

		int resist = sorcerer.getResist();
		sorcerer.setResist(resist + 5);
		System.out.println("守りの指輪を装備しました．");
		sorcerer.showState();
	}
}
