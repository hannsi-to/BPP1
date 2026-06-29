/*
 * 提出者 26-1-211-9999 近大太郎
 * 課題11-2
 * 提出日 2026/6/23
 */

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを生成後，引数指定した相手に挨拶する
 */
public class SorcererTest2 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// 名前「ハリー」，魔力11，抵抗力12で魔術師のオブジェクトを生成する
		// showName() で魔術師の名前を表示する
		// greeting (String) で魔術師が「ハグリッド」に挨拶する

		Sorcerer sorcerer = new Sorcerer("ハリー",11,12);
		sorcerer.showName();
		sorcerer.greeting("ハグリッド");
	}
}
