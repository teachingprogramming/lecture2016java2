package net.teachingprogramming.lecture07.p4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> jisho = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("[MENU] 終了(q), 入力(i), 検索(s): ");
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            } else if (input.equals("i")) {
                System.out.print("英語: ");
                String english = scanner.next();
                System.out.print("日本語: ");
                String japanese = scanner.next();
                jisho.put(english, japanese);
                System.out.println("登録しました。");
            } else if (input.equals("s")) {
                System.out.print("英語: ");
                String english = scanner.next();
                String japanese = jisho.get(english);
                if (japanese == null) {
                    System.out.println("登録されていません。");
                } else {
                    System.out.println("日本語: " + japanese);
                }
            } else {
                System.out.println("コマンドが違います。");
            }
        }
    }
}
