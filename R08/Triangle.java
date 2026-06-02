public class Triangle {
    private int lengthA;//辺１
    private int lengthB;//辺２
    private int lengthC;//辺３

    /**
     * コンストラクター
     * @param lengthA //辺１
     * @param lengthB //辺１
     * @param lengthC //辺１
     */
    public Triangle(int lengthA, int lengthB, int lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    /**
     * 面積を計算
     * @return 面積
     */
    public double calcArea(){
        double s = (lengthA+lengthB+lengthC)/2.0;
        return Math.sqrt(s*((s-lengthA)*(s-lengthB)*(s-lengthC)));
    }

    public static void main(String[] args) {
        // Trinagleオブジェクトを生成
        Triangle triangle1 = new Triangle(16,17,20);
        // Trinagleオブジェクトを生成
        Triangle triangle2 = new Triangle(7,6,4);

        System.out.printf("1問目の解答は%fです\n", triangle1.calcArea() - triangle2.calcArea());

        // Trinagleオブジェクトを再生成
        triangle1 = new Triangle(20,22,30);
        // Trinagleオブジェクトを再生成
        triangle2 = new Triangle(5,5,5);

        System.out.printf("2問目の解答は%fです\n", triangle1.calcArea() - (triangle2.calcArea() * 2));

    }
}
