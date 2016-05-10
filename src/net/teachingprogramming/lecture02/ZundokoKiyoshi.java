package net.teachingprogramming.lecture02;

/**
 * ズンドコキヨシ
 * http://teachingprogramming.net/
 */
public class ZundokoKiyoshi {
    public static void main(String[] args) {
        int zun_count = 0;
        while (true) {
            double random = Math.random();
            if (random < 0.7) {
                System.out.println("ズン");
                zun_count++;
            } else {
                System.out.println("ドコ");
                if (zun_count >= 4) {
                    System.out.println("キ・ヨ・シ！");
                    break;
                }
                zun_count = 0;
            }
        }
    }
}
