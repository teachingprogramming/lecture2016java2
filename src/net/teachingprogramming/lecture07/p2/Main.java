package net.teachingprogramming.lecture07.p2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = generateWordList();
        // 回答ここから
        System.out.println(wordList.size()); // 単語の総数を表示
        int youCount = 0; // 「you」の数をカウントする変数
        int fiveCount = 0; // 5文字以上の長さの単語をカウントする変数
        for (String word : wordList) {
            if (word.equals("you")) {
                youCount++;
            }
            if (word.length() >= 5) {
                fiveCount++;
            }
        }
        System.out.println(youCount); //「you」の数を表示
        System.out.println(fiveCount); // 5文字以上の長さの単語の数を表示
        Collections.sort(wordList); // wordListをソート
        String last = wordList.get(wordList.size() - 1); // 最後の単語を取り出す
        System.out.println(last); // ソートした最後にくる単語を表示
        // 回答ここまで
    }

    private static ArrayList<String> generateWordList() {
        ArrayList<String> wordList = new ArrayList<String>();
        String text = "Our daily life is supported by Electronic Control System Engineering in various ways. For example, the technologies, such as automobiles, mobile phones, medical equipment etc. are totally different in their uses, but, they share the point that the hardware is controlled by the computer. " +
                "The goal of our department is to educate the practical engineers with the technical knowledge and the system integration technology that can be applied to various fields. Thus, you can learn about the various kinds of fields, such as Electrical and Electronics Engineering, Control Engineering, Programming Language, Mechanical Engineering and so on, with our well　balanced curriculum from the basic study to the application field. As Mathematics, Physics and English are very important for all engineering fields, we spend much time for these fundamentals, too. " +
                "In the lower grades, you learn the fundamental subjects which are required for the electronic control engineering, such as, the development of a robot using LEGO blocks, the programming language, the electronic circuit design, Micro Intelligent Robot System (MIRS) and so on. On Undergraduate Study in the senior year, you will approach the engineering problem for yourself. In order to solve it, you work on the problem by applying the knowledge and technique that you learned in 5 years. " +
                "The graduate in our department plays an active part in various industrial fields of electric and electronics engineering, mechanical engineering, and information engineering. Also, in order to learn even deeper technical knowledge, some of the graduates will go to University, Institute of Technology, or “the advanced course in National Institute of Technology, Numazu College (NIT, NC)”. If you have chosen to go the advanced course, you can continue your study for another 2 years under the supervisor, and you can publish your results of the study internationally.";
        for (String a : text.split(" ")) {
            wordList.add(a);
        }
        return wordList;
    }
}
