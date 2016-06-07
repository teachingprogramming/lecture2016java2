package net.teachingprogramming.lecture07.p2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = generateWordList();
        // 回答ここから

        // 回答ここまで
    }

    private static ArrayList<String> generateWordList() {
        ArrayList<String> wordList = new ArrayList<String>();
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(new java.net.URL("http://teachingprogramming.net/wp/wp-content/uploads/2016/06/d.txt").openConnection().getInputStream()));
            while (br.ready()) {
                for (String word : br.readLine().split(" ")) {
                    wordList.add(word.trim());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return wordList;
    }
}
