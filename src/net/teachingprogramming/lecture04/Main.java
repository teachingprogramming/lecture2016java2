package net.teachingprogramming.lecture04;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ドラえもん", 129.3, 1.293);
        person1.selfIntroduction();
        /*
        person1.name = "のび太"; // nameはprivateなのでエラーになる
        */

        Person person2 = new Person("ドラミ", 91.0, 1.0);
        person2.selfIntroduction();
        /*
        Person person3 = new Person(); // 引数なしのコンストラクタは用意されてないのでエラーになる。
        */
        Teacher teacher1 = new Teacher("たなか", 70.0, 1.75);
        teacher1.selfIntroduction();
        teacher1.bmiHantei();
    }
}
