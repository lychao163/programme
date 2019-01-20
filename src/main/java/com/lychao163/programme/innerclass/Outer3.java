package com.lychao163.programme.innerclass;

public class Outer3 {
    public void test(int x, int y) {
        Point point = new Point(3, 4) {
            @Override
            public double distance() {
                return distance(new Point(x, y));
            }
        };
        System.out.println(point.getX());
        System.out.println(point.distance());
    }
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test(12, 16);
    }
}
