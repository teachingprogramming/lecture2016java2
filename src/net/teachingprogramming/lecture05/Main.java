package net.teachingprogramming.lecture05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        // ArrayListの例(1) Stringのインスタンスを格納する
        ArrayList<String> stringList = new ArrayList<String>(); // インスタンス化
        stringList.add("あああ"); // 「あああ」を追加
        stringList.add("いいい"); // 「いいい」を追加
        stringList.add("ううう"); // 「ううう」を追加
        stringList.add("いいい"); // 「いいい」を追加
        for (int i=0; i<stringList.size(); i++) { // sizeメソッドで要素数が取得できる
            String s = stringList.get(i); // getメソッドでi番目の要素を取得する。
            System.out.println(s);
        }
        for (String e : stringList) { // 拡張for文
            System.out.println(e);
        }

        // ArrayListの例(2) 自作のクラス（Person）のインスタンスを格納する。
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("たろう", 70.0, 1.70));
        personList.add(new Person("じろう", 75.0, 1.74));
        for (Person p : personList) {
            p.selfIntroduction();
        }

        // HashSetの例(1) Stringのインスタンスを格納する
        HashSet<String> stringSet = new HashSet<String>();
        stringSet.add("あああ"); // 「あああ」を追加
        stringSet.add("いいい"); // 「いいい」を追加
        stringSet.add("ううう"); // 「ううう」を追加
        stringSet.add("いいい"); // 「いいい」を追加
        for (String s : stringSet) { // getは使えない。拡張forで取得する
            System.out.println(s); // 「いいい」は1回しか表示されない
        }

        // HashSetの例(2) 自作のクラス（Person）のインスタンスを格納する。
        HashSet<Person> personSet = new HashSet<Person>();
        personSet.add(new Person("たろう", 70.0, 1.70));
        personSet.add(new Person("じろう", 75.0, 1.74));
        personSet.add(new Person("たろう", 70.0, 1.70));
        for (Person p : personSet) {
            p.selfIntroduction(); // 「じろう」は1回、「たろう」は2回、selfIntroductionメソッドが実行される。
        }

        // HashMapの例
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("hello", "こんにちは"); // 「hello」と「こんにちは」のペアを追加
        dictionary.put("world", "世界"); // 「world」と「世界」のペアを追加
        String s = dictionary.get("hello"); // 「hello」に対応する日本語を取得
        System.out.println(s);
        dictionary.put("hello", "もしもし"); // 「hello」の対応を「もしもし」に変更（上書き）
        for (String key : dictionary.keySet()) { // keySetメソッドでキーのSetがとり出せる。
            String value = dictionary.get(key);
            System.out.println(key +" "+value);
        }

    }
}
