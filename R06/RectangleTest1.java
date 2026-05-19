/*
    提出者 26-0248 小川皓
    課題6-RectangleTest1.java
    提出日 2026/5/19
    再提出日 2024/MM/DD（再提出時のみ）
*/

public class RectangleTest1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 1, 5, 6);
        rectangle1.showState();
        rectangle1.move(2, 2);
        rectangle1.showState();
    }
}
