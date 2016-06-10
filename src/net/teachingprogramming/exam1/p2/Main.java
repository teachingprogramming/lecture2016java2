package net.teachingprogramming.exam1.p2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = generateNumberList(args);
        // 回答ここから

        // 回答ここまで
    }

    static ArrayList<Integer> generateNumberList(String[] args) {
        long seed = 0;
        if (args.length != 0) {
            seed = Long.parseLong(args[0]);
        }
        Random random = new Random(seed);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i=0; i<1000; i++) {
            numberList.add(random.nextInt(10000));
        }
        return numberList;
    }
}
