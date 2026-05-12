public class Fighter {
    private String name;
  
    public Fighter(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("私の名前は" + name + "です。");
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Alice");
        fighter1.showName();
    }

}