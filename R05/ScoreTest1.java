public class ScoreTest1 {
    public static void main(String[] args){
        Office engOffice = new Office("情報学部センター");

        engOffice.registerScore("加藤",97);
        engOffice.registerScore("多田",95);

        engOffice.showAllScores();
    }
}
