/*
    提出者 : 26-0248 小川皓（各自変更）
    課題番号 : 9-4
    提出日 : 2026/6/09（各自変更）
*/

public class MetroFare {
    /* Field */
    int age; // 乗客の年齢
    int section; // 乗車区間（1区〜5区）
    
    /* 【課題9-4 手順1】
    Constructor */
    public MetroFare(int age, int distance) {
	/*
	(1) ageをageフィールドに代入する
	(2) distanceに応じてsectionフィールドに適切な値を代入する（if文で場合分する）
	*/
        this.age = age;
        if(distance <= 3){
            section = 1;
        }else if(distance <= 7){
            section = 2;
        }else if(distance <= 13){
            section = 3;
        }else if(distance <= 19){
            section = 4;
        }else {
            section = 5;
        }
    }

    /* 【課題9-4 手順2】
        ageフィールドのゲッター
    */
    public int getAge() {
        return age;
    }

    /* 【課題9-4 手順3】
        sectionフィールドのゲッター
    */
    public int getSection() {
        return section;
    }

    /* 【課題9-4 手順4】
        料金を計算する
        @return 料金
    */
    private int calcFare() {
	    int fare=0; // 料金を入れる変数（念の為0で初期化）

	/*
	方針：
	(1) まず年齢で3つの場合（6歳未満，6歳以上12歳未満，12歳以上）に分ける（if文）
	(2) if文のブロックの中でswitch文を使い，sectionに応じた料金を変数に代入する
	
	*/

        if(age < 6){
            switch (section) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    fare = 0;
                    break;
            }
        }else if(age < 12){
            switch (section) {
                case 1:
                    fare = 100;
                    break;
                case 2:
                    fare = 120;
                    break;
                case 3:
                    fare = 150;
                    break;
                case 4:
                    fare = 170;
                    break;
                case 5:
                    fare = 200;
                    break;
            }
        }else{
            switch (section) {
                case 1:
                    fare = 190;
                    break;
                case 2:
                    fare = 240;
                    break;
                case 3:
                    fare = 290;
                    break;
                case 4:
                    fare = 340;
                    break;
                case 5:
                    fare = 390;
                    break;
            }
        }

	    return fare;
    }

    /**
    料金を画面（ターミナル）に表示する．
    このメソッドは編集しないこと．
    */
    public void showFare() {
	    System.out.printf("料金は%d円です．\n",this.calcFare());
    }
}