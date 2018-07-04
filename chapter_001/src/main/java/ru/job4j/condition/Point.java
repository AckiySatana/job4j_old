package ru.job4j.condition;

import ru.job4j.calculator.Converter;
import ru.job4j.loop.Paint;

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {

        Paint paint = new Paint();
        System.out.println(paint.pyramid(5));

        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);

        Converter conv = new Converter();
        System.out.println("zz");
        conv.SetVal("EUR",50);
        System.out.println("zopa");
        conv.RubToVal(5,"EUR", false);


    }

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}