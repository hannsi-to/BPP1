/*
    提出者 26-0248 小川皓
    課題6-Rectangle
    提出日 2026/5/19
    再提出日 2024/MM/DD（再提出時のみ）
*/

public class Rectangle {
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
  
    public Rectangle(int xPosition, int yPosition, int width, int height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

   public void move(int xMove, int yMove) {
       xPosition = xPosition + xMove;
       yPosition = yPosition + yMove;
    }

    public void showState() {
        System.out.print("x座標: " + xPosition + ", y座標 : " + yPosition);
        System.out.println(", 幅: " + width + ", 高さ: " + height);
    }

    public void flip() {
        int temp = width;
        width = height;
        height = temp;
    }

    public void expandBoth(int scale){
        width *= scale;
        height *= scale;
    }

    public void expandEach(int widthScale, int heightScale) {
        width *= widthScale;
        height *= heightScale;
    }
}