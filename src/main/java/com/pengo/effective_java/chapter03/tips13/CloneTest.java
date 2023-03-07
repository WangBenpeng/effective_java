package com.pengo.effective_java.chapter03.tips13;

/**
 * @author Benpeng
 * @date 2023/3/6
 */
public class CloneTest {
    public static void main(String[] args) {
        testHashTable();
    }

    static void testHashTable() {
        HashTable h1 = new HashTable();
        h1.set(0, 1);
        h1.set(1, 2);
        HashTable h2 = h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();
        h1.set(2, 3);
        System.out.println(h1);
        System.out.println(h2);

    }

    static void testStack() {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        Stack s2 = s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        s1.pop();
        System.out.println(s1);
        System.out.println(s2);
    }

    static void testPhoneNumber() {
        PhoneNumber p1 = new PhoneNumber(123, 999, 111);
        PhoneNumber p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }
}
