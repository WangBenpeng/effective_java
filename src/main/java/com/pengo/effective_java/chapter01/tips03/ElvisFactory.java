package com.pengo.effective_java.chapter01.tips03;

/**
 * @author Benpeng
 * @date 2023/3/1
 */
public class ElvisFactory {

    private static final ElvisFactory INSTANCE = new ElvisFactory();

    private ElvisFactory() {
    }

    public static ElvisFactory getInstance() {
        return INSTANCE;
    }
}
