package pre;

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

    public Rectangle() {
        this.xPosition = 0;
        this.yPosition = 0;
        this.width = 1;
        this.height = 1;
    }

    public void move(int xMove,int yMove){
        xPosition = xPosition + xMove;
        yPosition = yPosition + yMove;
    }

    public void move(){
        xPosition = xPosition + 1;
        yPosition = yPosition + 1;
    }

    public void showState(){
        System.out.print("x座標: " + xPosition + ", y座標: " + yPosition);
        System.out.println(", 幅: " + width + ", 高さ: " + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,1,5,6);
        rectangle1.showState();
    }
}
