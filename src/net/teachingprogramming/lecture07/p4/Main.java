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
            } else {
                System.out.println("コマンドが違います。");
            }
        }
    }
}
