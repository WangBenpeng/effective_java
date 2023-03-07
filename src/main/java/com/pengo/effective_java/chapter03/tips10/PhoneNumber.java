package com.pengo.effective_java.chapter03.tips10;

/**
 * @author Benpeng
 * @date 2023/3/4
 */
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangCheck(areaCode, 999, "area code");
        this.prefix = rangCheck(prefix, 999, "prefix code");
        this.lineNum = rangCheck(lineNum, 9999, "line num");
    }

    private static short rangCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ":" + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNum == lineNum;
    }

}
