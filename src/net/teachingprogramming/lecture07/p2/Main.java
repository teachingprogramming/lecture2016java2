package net.teachingprogramming.lecture07.p2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = generateWordList();
        // 回答ここから
        System.out.println(wordList.size());
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
