package net.teachingprogramming.lecture01;

/**
 * 3の倍数でアホになる（ベースとなるプログラム）
 */
public class Nabeatsu {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "!");
            } else {
                System.out.println(i);
            }
        }
    }
}
