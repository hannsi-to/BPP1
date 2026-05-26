/**
    提出者 26-0248 小川皓
    課題7-Rectangle
    提出日 2026/5/26
    再提出日 YYYY/MM/DD（再提出時のみ）
*/
public class Rectangle {
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private int xSpeed = 10;
    private int ySpeed = 10;

    /**
     * 指定された位置と大きさの長方形を作成します。
     */
    public Rectangle(int xPosition, int yPosition, int width, int height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    /**
     * デフォルトの位置と大きさの長方形を作成します。
     */
    public Rectangle() {
        this.xPosition = 0;
        this.yPosition = 0;
        this.width = 1;
        this.height = 1;
    }

    /**
     * 指定された距離だけ長方形を移動させます。
     */
    public void move(int xMove,int yMove){
        xPosition = xPosition + xMove;
        yPosition = yPosition + yMove;
    }

    /**
     * デフォルトの距離だけ長方形を移動させます。
     */
    public void move(){
        xPosition = xPosition + 1;
        yPosition = yPosition + 1;
    }

    /**
     * 詳細な状態を表示します。
     */
    public void showState(){
        System.out.print("x座標: " + xPosition + ", y座標: " + yPosition);
        System.out.println(", 幅: " + width + ", 高さ: " + height);
    }

    /**
     * 長方形の面積を計算します。
     */
    public int calcArea(){
        return width * height;
    }

    /**
     * 幅と高さの値を同じ倍率で拡大
     */
    public void expand(int scale){
        width *= scale;
        height *= scale;
    }

    /**
     * 幅と高さの値をそれぞれに指定された倍率で拡大
     */
    public void expand(int widthScale, int heightScale) {
        width *= widthScale;
        height *= heightScale;
    }

    /**
     * 面積を含めた詳細な状態を表示します。
     */
    public void showDetailedState(){
        showState();
        System.out.println("面積: " + calcArea());
    }

    public void showSpeed(){
        System.out.println("x速度: " + xSpeed + ", y速度: " + ySpeed);
    }

    public void update(){
        xPosition += xSpeed;
        yPosition += ySpeed;
    }

    /**
     * 幅のゲッター
     */
    public int getWidth() {
        return width;
    }

    /**
     * 幅のセッター
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
