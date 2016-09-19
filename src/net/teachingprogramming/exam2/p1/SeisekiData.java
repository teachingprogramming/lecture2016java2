package net.teachingprogramming.exam2.p1;

import java.util.ArrayList;
import java.util.Random;

public class SeisekiData {
    public static ArrayList<Seiseki> getSeisekiList() {
        Random random = new Random(0);
        ArrayList<Seiseki> seisekiList = new ArrayList<>();
        for (int i=1; i<=40; i++) {
            seisekiList.add(new Seiseki("出席番号"+i, 60+random.nextInt(20), 50+random.nextInt(20), 40+random.nextInt(20), random.nextInt(10)));
        }
        return seisekiList;
    }
}
