/*
    提出者 26-9999 近大太郎
    課題7-2
    提出日 2026/5/26
    再提出日 YYYY/MM/DD（再提出時のみ）
*/
public class RectangleTest2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,1,5,6);
        rectangle1.showState();
        System.out.println("の長方形の面積は" + rectangle1.calcArea() + "です");
    }
}
