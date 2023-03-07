package com.pengo.effective_java.chapter03.tips10;

/**
 * 3.违反传递性
 * @author Benpeng
 * @date 2023/3/3
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
////        if (!(obj instanceof Point))
////            return false;
//        if (obj == null || obj.getClass() != getClass())
//            return false;
//        Point p = (Point) obj;
//        return p.x == x && p.y == y;
//    }
}
