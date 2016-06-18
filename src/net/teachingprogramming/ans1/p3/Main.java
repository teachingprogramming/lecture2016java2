package net.teachingprogramming.ans1.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        HashSet<String> wordSet1 = generateWordSet(args, true);
        HashSet<String> wordSet2 = generateWordSet(args, false);
        // 回答ここから
        HashSet<String> sameSet = new HashSet<String>(); // どちらにも含まれる単語のHashSet
        for (String word : wordSet1) {
            if (wordSet2.contains(word)) {
                sameSet.add(word);
            }
        }
        System.out.println(sameSet.size()); // どちらにも含まれる単語の数を表示

        ArrayList<String> diffList = new ArrayList<String>();
        for (String word: wordSet1) { // wordSet1のみに含まれる単語をdiffListに追加
            if (!sameSet.contains(word)) {
                diffList.add(word);
            }
        }
        for (String word: wordSet2) { // wordSet2のみに含まれる単語をdiffListに追加
            if (!sameSet.contains(word)) {
                diffList.add(word);
            }
        }
        Collections.sort(diffList);
        for (String word : diffList) {
            System.out.println(word);
        }
        // 回答ここまで
    }

    static HashSet<String> generateWordSet(String[] args, boolean first) {
        if (args.length == 0) {
            args = ("come, get, give, go, keep, let, make, put, seem, take, be, do, have, say, see, send, may, will," +
                    "about, across, after, against, among, at, before, between, by, down, from, in, off, on, over," +
                    "through, to, under, up, with, as, for, of, till, than, a , the, all, any, every, little, much," +
                    "no, other, some, such, that, this, I , he, you, who, and, because, but, or, if, though, while," +
                    "how, when, where, why, again, ever, far, forward, here, near, now, out, still, then, there," +
                    "together, well, almost, enough, even, not, only, quite, so, very, tomorrow, yesterday, north," +
                    "south, east, west, please, yes").split(",");
        }
        HashSet<String> wordSet = new HashSet<String>();
        Random random = new Random(0);
        for (int i=0; i<args.length*4; i++) {
            int index = random.nextInt(args.length);
            if (first == (i%2 == 0)) {
                wordSet.add(args[index].trim());
            }
        }
        return wordSet;
    }
}
