package net.teachingprogramming.ans1.p2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = generateNumberList(args);
        // 回答ここから
        int sum = 0;
        int max = 0;
        int div3 = 0;

        for (int a : numberList) {
            sum += a;
            if (max < a) {
                max = a;
            }
            if (a % 3 == 0) {
                div3++;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(div3);
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
