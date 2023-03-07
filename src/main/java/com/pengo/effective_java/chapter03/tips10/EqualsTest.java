package com.pengo.effective_java.chapter03.tips10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Benpeng
 * @date 2023/3/2
 */
public class EqualsTest {
    public static void main(String[] args) {
//        testPhoneNum();
        test();
    }

    static void test() {
        String a = "abc";
        String aa = new String("abc");
        System.out.println(a.equals(aa));
        System.out.println(a == aa);
        System.out.println(a.hashCode());
        System.out.println(aa.hashCode());
    }

    static void testPhoneNum() {
        PhoneNumber p1 = new PhoneNumber(111, 222, 333);
        PhoneNumber p2 = new PhoneNumber(111, 222, 333);
        PhoneNumber p3 = new PhoneNumber(111, 222, 333);
        System.out.println(p1.equals(p2));
        System.out.println("对称性：");
        System.out.println(p2.equals(p1));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println("传递性：");
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        System.out.println("一致性：");
        System.out.println(p1.equals(p2));
    }

    /**
     * 测试传递性
     * @author Benpeng
     * @date 2023/3/3
     */
    static void testPoint() {
        Point colorPointBlue = new ColorPoint(1, 2, Color.BLUE);
        Point point = new Point(1, 2);
        Point colorPoint = new ColorPoint(1, 2, Color.RED);
        System.out.println(colorPointBlue.equals(point));
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPointBlue.equals(colorPoint));
    }

    /**
     * 测试对称性
     * @author Benpeng
     * @date 2023/3/3
     */
    static void testCase() {
        CaseInsensitiveString polish = new CaseInsensitiveString("Polish");
        CaseInsensitiveString lowerPolish = new CaseInsensitiveString("polish");
        String str = "polish";
        System.out.println(polish.equals(lowerPolish));
        System.out.println(lowerPolish.equals(polish));
        System.out.println(polish.equals(str));
        System.out.println(str.equals(polish));
        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(polish);
        System.out.println(list.contains(str));
    }
}
