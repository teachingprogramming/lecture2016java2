package net.teachingprogramming.exam1.p4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("[MENU] 終了(q), 入力(i), 検索(s), 削除(d), 一覧表示(l): ");
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            } else if (input.equals("i")) {
                System.out.print("名前: ");
                String name = scanner.next();
                System.out.print("電話番号: ");
                String tel = scanner.next();
                phonebook.put(name, tel);
                System.out.println("登録しました。");
            } else {
                System.out.println("コマンドが違います。");
            }
        }
    }
}
