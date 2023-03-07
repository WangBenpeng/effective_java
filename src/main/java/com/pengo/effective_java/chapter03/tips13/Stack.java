package com.pengo.effective_java.chapter03.tips13;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Benpeng
 * @date 2023/3/6
 */
public class Stack implements Cloneable{
    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_SIZE];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    @Override
    protected Stack clone() {
        try {
            Stack clone = (Stack) super.clone();
            clone.elements = elements.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
