package com.pengo.effective_java.chapter03.tips10;

import java.util.Objects;

/**
 * 2.违反对称性
 * @author Benpeng
 * @date 2023/3/2
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }
//        if (obj instanceof String) {
//            return s.equalsIgnoreCase((String) obj);
//        }
        return false;
    }
}
