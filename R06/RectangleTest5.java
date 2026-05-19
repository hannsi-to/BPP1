/*
    提出者 26-0248 小川皓
    課題6-5
    提出日 2026/5/19
    再提出日 2024/MM/DD（再提出時のみ）
*/

public class RectangleTest5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 1, 5, 6);
        rectangle1.showState();
        rectangle1.expandEach(2,10);
        rectangle1.showState();
        rectangle1.expandEach(5,20);
        rectangle1.showState();
    }
}