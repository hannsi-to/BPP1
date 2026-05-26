/*
    提出者 26-0248 小川皓
    課題7-5
    提出日 2026/5/26
    再提出日 YYYY/MM/DD（再提出時のみ）
*/
public class RectangleTest5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,1,5,6);
        rectangle1.showState();
        rectangle1.expand(2);
        rectangle1.showState();
        rectangle1.expand(3,5);
        rectangle1.showState();
    }
}
