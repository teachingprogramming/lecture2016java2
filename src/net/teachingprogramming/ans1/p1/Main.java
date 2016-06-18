package net.teachingprogramming.ans1.p1;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(10, 20, 30);
        System.out.println("直方体1の体積は" + cuboid1.getVolume());
        if (cuboid1.hasSquare()) {
            System.out.println("面に正方形はある。");
        } else {
            System.out.println("面に正方形はない。");
        }
        int freight1 = cuboid1.getFreight();
        if (freight1 != -1) {
            System.out.println("基本運賃は" + freight1 + "円です。");
        } else {
            System.out.println("サイズオーバーで送ることができません。");
        }

        Cuboid cuboid2 = new Cuboid(50, 50, 100);
        System.out.println("直方体2の体積は" + cuboid2.getVolume());
        if (cuboid2.hasSquare()) {
            System.out.println("面に正方形はある。");
        } else {
            System.out.println("面に正方形はない。");
        }
        int freight2 = cuboid2.getFreight();
        if (freight2 != -1) {
            System.out.println("基本運賃は" + freight2 + "円です。");
        } else {
            System.out.println("サイズオーバーで送ることができません。");
        }


    }
}
