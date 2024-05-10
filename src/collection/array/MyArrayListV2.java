package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV2() {
        this.elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        this.elementDate = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementDate.length) {
            grow();
        }
        elementDate[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementDate.length;
        int newCapacity = oldCapacity * 2;
        elementDate = Arrays.copyOf(elementDate, newCapacity);
    }

    public Object get(int index) {
        return elementDate[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementDate[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementDate, size)) +
                " size = " + size + ", capacity = " + elementDate.length;
    }
}
