/*
    提出者 26-9999 近大太郎
    課題6-RectangleTest2.java
    提出日 2026/5/19
    再提出日 2024/MM/DD（再提出時のみ）
*/

public class RectangleTest2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 1, 5, 6);
        Rectangle rectangle2 = new Rectangle(5, 3, 3, 1);

        rectangle1.showState();
        rectangle1.move(2, 2);
        rectangle1.showState();

        rectangle2.showState();
        rectangle2.move(1, 4);
        rectangle2.showState();
    }
}
