package net.teachingprogramming.lecture04;

public class Person {
    /** 名前 */
    private String name;
    /** 体重[kg] */
    private double weight;
    /** 身長[m] */
    private double height;

    /**
     * コンストラクタ
     * @param name
     * @param weight
     * @param height
     */
    Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

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
