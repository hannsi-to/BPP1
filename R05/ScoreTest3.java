public class ScoreTest3 {
    public static void main(String[] args) {
        Office office = new Office("情報学部学生センター");

        office.registerScore("アルファ",60);
        office.registerScore("ブラボー",70);
        office.registerScore("チャーリー",95);

        office.showAllScores();
        office.showAverageScore();
        office.showMaxScore();
    }
}
