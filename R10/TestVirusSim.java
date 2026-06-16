public class TestVirusSim {
    public static void main(String[] args) {
        System.out.println("*** Test1 ***");
        virusSim sim1 = new virusSim(2, 1000);
        int days1 = sim1.simulate();
        System.out.println("感染者が1000人を超えるのは " + days1 + " 日後です");
        System.out.println("*** Test2 ***");
        virusSim sim2 = new virusSim(2, 30000);
        int days2 = sim2.simulate();
        System.out.println("感染者が30000人を超えるのは " + days2 + " 日後です");
        System.out.println("*** Test3 ***");
        virusSim sim3 = new virusSim(2, 100000);
        int days3 = sim3.simulate();
        System.out.println("感染者が100000人を超えるのは " + days3 + " 日後です");
    }
}
