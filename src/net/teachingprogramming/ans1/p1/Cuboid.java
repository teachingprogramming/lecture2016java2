package net.teachingprogramming.ans1.p1;

public class Cuboid {
    int x;
    int y;
    int z;

    Cuboid(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int getVolume() {
        return x * y * z;
    }

    boolean hasSquare() {
        return (x == y) || (y == z) || (z == x);
    }

    int getFreight() {
        int size = x + y + z;
        if (size <= 60) {
            return 690;
        } else if (size <= 80) {
            return 900;
        } else if (size <= 100) {
            return 1130;
        } else if (size <= 120) {
            return 1340;
        } else if (size <= 140) {
            return 1560;
        } else if (size <= 160) {
            return 1780;
        } else if (size <= 170) {
            return 2070;
        } else {
            return -1;
        }
    }

}
