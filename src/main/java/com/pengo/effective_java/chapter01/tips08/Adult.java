package com.pengo.effective_java.chapter01.tips08;

/**
 * @author Benpeng
 * @date 2023/3/2
 */
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}
