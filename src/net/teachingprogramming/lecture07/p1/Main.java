package net.teachingprogramming.lecture07.p1;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        int area = r.getArea();
        System.out.println("面積は" + area); //
        if (r.isSquare()) {
            System.out.println("正方形である。");
        } else {
            System.out.println("正方形ではない。");
        }
    }
}