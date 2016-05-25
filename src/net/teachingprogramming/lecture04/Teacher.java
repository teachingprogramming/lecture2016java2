package net.teachingprogramming.lecture04;


public class Teacher extends Person {

    /** 教えている教科 */
    String kyouka = "英語";

    /**
     * コンストラクタ
     */
    Teacher(String name, double weight, double height) {
        super(name, weight, height); // スーパークラスのコンストラクタを呼ぶ
    }

    /**
     * スーパークラスのselfIntroductionをオーバーライド
     */
    void selfIntroduction() {
        super.selfIntroduction();
        System.out.println(kyouka+"を教えています。");
    }

    /**
     * BMIの値から状態を判定
     */
    void bmiHantei() {
        if (bmi() > 22) {
            System.out.println("太り気味です。");
        } else {
            System.out.println("太っていません。");
        }
    }

}
