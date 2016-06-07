package net.teachingprogramming.lecture07.p1;

class Rectangle {
    private int x;
    private int y;

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getArea() {
        return x * y;
    }

    boolean isSquare() {
        return this.x == this.y;
    }
}
