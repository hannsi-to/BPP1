public class ScoreTest5 {
    public static void main(String[] args) {
        Office engOffice1;
        Office engOffice2;
        // オブジェクトの生成
        engOffice1 = new Office("情報学部学生センター");
        engOffice2 = new Office("情報学部学生センター");
        // engOffice1に成績を登録
        engOffice1.registerScore("アルファ", 60);
        engOffice1.registerScore("ブラボー", 70);
        // engOffice1に成績を登録
        engOffice2.registerScore("チャーリー", 95);
        engOffice2.registerScore("デルタ", 60);
        // engOffice1に登録された成績を表示
        engOffice1.showAllScores();
        // engOffice2に登録された成績を表示
        engOffice2.showAllScores();
    }
}
