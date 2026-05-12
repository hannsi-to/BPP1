import java.util.*;

/**
 * 学生センターを表すクラス（Office）
 */
public class Office {

	/**
	 * 学生名・得点を保持する（変更不要）
	 */
	private ArrayList<Score> scoreList;  // ScoreクラスのArrayList

	/**
	 * 学生センター名を保持する（変更不要）
	 */
	private String name;

	/**
	 * コンストラクタ（変更不要）
	 * @param name 学生センターの名前
	 */
	public Office(String name) {
		this.name = name;
		this.scoreList = new ArrayList<Score>();
	}

	/**
	 * 学生数を返す（変更不要）
	 * @return 学生数
	 */
	public int getStudentNum() {
		return scoreList.size();
	}

	/**
	 * 引数で指定された学生の得点を返す（変更不要）
	 * @param n 学生のインデックス(n番目の学生ならn-1と指定)
	 * @return 学生数
	 */
	public int getStudentScore(int n) {
		if ( getStudentNum() < n ) return -1;
		else return scoreList.get(n).getScoreValue();
	}

	/**
	 * 得点を登録する（変更不要）
	 * @param studentName 学生の名前
	 * @param scoreValue 点数
	 */
	public void registerScore(String studentName, int scoreValue) {
		Score score = new Score(studentName, scoreValue);
		scoreList.add(score);
	}

	/**
	 * 全ての得点を表示する（変更不要）
	 */
	public void showAllScores() {
		System.out.printf("%sに登録されている全得点\n", this.name );
		for (Score score : scoreList) {
			System.out.printf("学生名:%s,", score.getStudentName());
			System.out.printf("得点:%d\n", score.getScoreValue());
		}
	}

	/**
	 * 平均点を表示する（変更不要）
	 */
	public void showAverageScore() {
		int sum = 0;
		double averageScore;
		// このクラスで定義されているgetStudentNum()メソッドを用いて
		// 繰り返し回数（得点が格納されている学生の数）を設定．
		// 同じクラスのメソッドを呼び出す際には，単にメソッド名を指定
		// すればよい．例：getStudentNum()
		for (int i=0; i < getStudentNum(); i++) {
			// このクラスで定義されているgetStudentScore()を呼び出して，
			// i番目の学生の得点を調べ，変数sumに足し合わせる．
			sum += getStudentScore(i);  
		}
		averageScore = (double) sum / getStudentNum();
		System.out.println( "登録されている得点の平均:" + averageScore );
	}

	/**
	 * 最高点を求めて表示する（変更不要）
	 */
	public void showMaxScore() {
		// 最初の得点を仮の最高得点としておく
		int maxScore = getStudentScore(0);

		// このクラスで定義されているgetStudentNum()メソッドを用いて
		// 繰り返し回数（得点が格納されている学生の数）を設定．
		// 同じクラスのメソッドを呼び出す際には，単にメソッド名を指定
		// すればよい．例：getStudentNum()
		for (int i=0; i < getStudentNum(); i++) {
			// このクラスで定義されているgetStudentScore()を呼び出して，
			// i番目の学生の得点を調べ，変数maxScoreと比較する．
			if (maxScore < getStudentScore(i)) {
				maxScore = getStudentScore(i);
			}
		}
		System.out.println("登録されている最高得点は得点:" + maxScore);
	}
}
