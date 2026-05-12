/**
 * 成績を示すクラス（Score）
 */
public class Score {

	/**
	 * 学生の名前
	 */
	private String studentName;

	/**
	 * 得点
	 */
	private int scoreValue;

	/**
	 * コンストラクタ
	 * @param studentName 学生の名前
	 * @param scoreValue 得点
	 */
	public Score(String studentName, int scoreValue) {
		this.setScoreValue(scoreValue);
		this.setStudentName(studentName);
	}

	/**
	 * 得点のセッター
	 * @param scoreValue 得点
	 */
	public void setScoreValue(int scoreValue) {
		this.scoreValue = scoreValue;
	}

	/**
	 * 名前のセッター
	 * @param studentName 名前
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
   }

	/**
	 * 得点のゲッター
	 */
	public int getScoreValue() {
		return this.scoreValue;
	}

	/**
	 * 名前のゲッター
	 */
	public String getStudentName() {
		return this.studentName;
	}
}
