package com.pengo.effective_java.chapter01.tips03;

import java.io.Serializable;

/**
 * @author Benpeng
 * @date 2023/3/1
 */
public class ElvisField implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final ElvisField instance = new ElvisField();

    private ElvisField() {
    }

    private Object readResolve() {
        return instance;
    }
}
