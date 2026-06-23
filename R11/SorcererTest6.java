/*
 * 提出者 26-1-211-0248 小川皓
 * 課題11-6
 * 提出日 2026/6/23
 */

import java.util.Scanner;

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを生成後，キーボードから指定した値だけ魔力を増減させる
 */
public class SorcererTest6 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// Scanner クラスのオブジェクトを生成する

		// 名前「ハリー」，魔力11，抵抗力12で魔術師のオブジェクトを生成する
		// showName() で魔術師の名前を表示する
		// showState() で魔術師の状態を表示する

		// 「どのくらい強化しますか？」と表示する
		// キーボードから整数値を入力する

		// enhance (int) で魔術師の魔力を（整数値）％増減する
		// showState() で魔術師の状態を表示する

		// Scanner クラスのオブジェクトを閉じる

		Scanner scanner = new Scanner(System.in);

		Sorcerer sorcerer = new Sorcerer("ハリー",11,12);
		sorcerer.showName();
		sorcerer.showState();

		System.out.print("どのくらい強化しますか？");
		int rate = scanner.nextInt();
		sorcerer.enhance(rate);
		sorcerer.showState();

		scanner.close();
	}
}
