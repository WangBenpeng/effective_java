package com.pengo.effective_java.chapter01.tips03;

import java.io.*;

/**
 * @author Benpeng
 * @date 2023/3/1
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
//        testField();
//        testFactory();
        testSerializable();
    }

    static void testSerializable() throws Exception {
        ElvisField instance = ElvisField.instance;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(
                "/Users/pengo/IdeaProjects/pengo/effective_java/src/main/java/com/pengo/effective_java/chapter01/tips03/a.txt"));
        objectOutputStream.writeObject(instance);

        File file = new File("/Users/pengo/IdeaProjects/pengo/effective_java/src/main/java/com/pengo/effective_java/chapter01/tips03/a.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ElvisField instance2 = (ElvisField) objectInputStream.readObject();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);

    }

    static void testField() {
        ElvisField field1 = ElvisField.instance;
        ElvisField field2 = ElvisField.instance;
        System.out.println(field2 == field1);

    }

    static void testFactory() {
        ElvisFactory factory1 = ElvisFactory.getInstance();
        ElvisFactory factory2 = ElvisFactory.getInstance();
        System.out.println(factory1 == factory2);
    }
}
