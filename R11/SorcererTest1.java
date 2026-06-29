/*
 * 提出者 26-1-211-9999 近大太郎
 * 課題11-1
 * 提出日 2026/6/23
 */

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを生成し，名前と状態を表示する
 */
public class SorcererTest1 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// 名前「ハリー」，魔力11，抵抗力12で魔術師のオブジェクトを生成する
		// showName() で魔術師の名前を表示する
		// showState() で魔術師の状態を表示する

		Sorcerer sorcerer = new Sorcerer("ハリー",11,12);
		sorcerer.showName();
		sorcerer.showState();
	}
}
