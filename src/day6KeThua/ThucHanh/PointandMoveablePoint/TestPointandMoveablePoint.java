package day6KeThua.ThucHanh.PointandMoveablePoint;

import java.awt.Point;

public class TestPointandMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point();

        MoveablePoint moveablePoint = new MoveablePoint(3.5f, 1.4f, 3.5f, 2.5f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}

