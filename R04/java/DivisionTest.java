
public class DivisionTest {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        double c = 3.0;
        int ans = 0;
        double answer = 0;

        System.out.println("a=" + a + ", b=" + b + ", c=" + c + "です。");

        ans = a + b;

        System.out.println("aたすbは" + ans + "です。");

        answer = a / c;
        ans = a / b;

        System.out.println("aわるcは" + answer + "です。");
        System.out.println("aわるbは" + ans + "です。なんで？？？");
    }
}
