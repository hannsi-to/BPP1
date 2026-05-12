public class ScoreTest4 {
    public static void main(String[] args) {
        Office office = new Office("情報学部学生センター");

        office.registerScore("アルファ",60);
        office.registerScore("ブラボー",70);
        office.registerScore("チャーリー",95);

        System.out.println("登録されている学生数は" + office.getStudentNum() + "人です");
        System.out.println("2番目に登録された学生の得点は" + office.getStudentScore(1) + "点です");
    }
}
