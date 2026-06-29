/*
 * 提出者 26-1-211-9999 近大太郎
 * 課題11-3
 * 提出日 2026/6/23
 */

import java.util.Scanner;

/**
 * Sorcerer クラスの実行確認用クラス
 * Sorcerer クラスのオブジェクトを2つ生成後，引数で指定した相手に挨拶する
 */
public class SorcererTest3 {
	/**
	 * メインメソッド
	 * @param args : コマンドライン引数は使用しない
	 */
	public static void main (String[] args) {
		// 名前「ハリー」，魔力11，抵抗力12で魔術師1のオブジェクトを生成する
		// showName() で魔術師1の名前を表示する

		// 名前「ロン」，魔力9，抵抗力9で魔術師2のオブジェクトを生成する
		// showName() で魔術師2の名前を表示する

		// greeting (Sorcerer) で魔術師1が魔術師2に挨拶する

		Sorcerer sorcerer1 = new Sorcerer("ハリー",11,12);
		sorcerer1.showName();

		Sorcerer sorcerer2 = new Sorcerer("ロン",9,9);
		sorcerer2.showName();

		sorcerer1.greeting(sorcerer2);
	}
}
