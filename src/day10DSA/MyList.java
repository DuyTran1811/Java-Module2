package day10DSA;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }
    public E remove(int index) {
        // Loai bo phan tu tai vi tri duoc chi dinh
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Khong tim thay phan tu cua vi tri: " + index);
        }
        E removeItem = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[size] = null;
        return removeItem;
    }
//    public E remove(int index) {
//        int j = 0;
//        for (int i = 0; i < elements.length; i++) {
//            if (index != i) {
//                elements[j] = elements[i];
//                ++j;
//            }
//        }
//        return (E) elements;
//    }
}
