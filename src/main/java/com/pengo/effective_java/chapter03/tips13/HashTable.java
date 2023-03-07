package com.pengo.effective_java.chapter03.tips13;

import java.util.Arrays;

/**
 * @author Benpeng
 * @date 2023/3/6
 */
public class HashTable implements Cloneable{

    private Entry[] buckets = new Entry[16];

    public void set(int index, Object obj) {
        Entry entry = new Entry(index, obj, null);
        buckets[index] = entry;
        if (index != 0) {
            buckets[--index].next = entry;
        }
    }


    private static class Entry{
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    protected HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null) {
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
