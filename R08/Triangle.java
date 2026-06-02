public class Triangle {
    private int lengthA;
    private int lengthB;
    private int lengthC;

    public Triangle(int lengthA, int lengthB, int lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public double calcArea(){
        double s = (lengthA+lengthB+lengthC)/2.0;
        return Math.sqrt(s*((s-lengthA)*(s-lengthB)*(s-lengthC)));
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(16,17,20);
        Triangle triangle2 = new Triangle(7,6,4);

        System.out.printf("1問目の解答は%fです\n", triangle1.calcArea() - triangle2.calcArea());

        triangle1 = new Triangle(20,22,30);
        triangle2 = new Triangle(5,5,5);
        System.out.printf("2問目の解答は%fです\n", triangle1.calcArea() - (triangle2.calcArea() * 2));

    }
}
