package net.teachingprogramming.lecture03;

public class Person {
    /** 名前 */
    String name;
    /** 体重[kg] */
    double weight;
    /** 身長[m] */
    double height;

    /**
     * 自己紹介するメソッド
     */
    void selfIntroduction() {
        System.out.println("私の名前は" + name + "です。");
        System.out.println("BMIは" + bmi() + "です");
    }

    /**
     * BMIを計算するメソッド
     * @return BMI
     */
    double bmi() {
        double x = weight / (height * height);
        return x;
    }

}
