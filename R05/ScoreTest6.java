public class ScoreTest6 {
    public static void main(String[] args) {
        Office engOffice1;
        Office engOffice2;
        // オブジェクトの生成
        engOffice1 = new Office("情報学部学生センターA");
        engOffice2 = new Office("情報学部学生センターB");
        // engOffice1(情報学部学生センターA)に成績を登録
        engOffice1.registerScore("アルファ", 60);
        engOffice1.registerScore ("ブラボー", 70);
        // engOffice1とengOffice2が参照するオブジェクトを交換
        // 以降はengOffice1が情報学部学生センターB
        // engOffice2が情報学部学生センターA
        Office tempEngOffice2 = engOffice2;
        engOffice2 = engOffice1;
        engOffice1 = tempEngOffice2;
        // engOffice2(情報学部学生センターA)に登録された成績を表示
        engOffice2.showAllScores();
        // engOffice1(情報学部学生センターB)に成績を登録
        engOffice1.registerScore ("チャーリー", 95);
        engOffice1.registerScore ("デルタ", 60);
        // engOffice1(情報学部学生センターB)に登録された成績を表示
        engOffice1.showAllScores();
    }
}