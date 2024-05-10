package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV4() {
        this.elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        this.elementDate = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    public void add(E e) {
        // 코드 추가
        if (size == elementDate.length) {
            grow();
        }
        elementDate[size] = e;
        size++;
    }

    public void add(int index, E e) {
        // 코드 추가
        if (size == elementDate.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementDate[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementDate[i] = elementDate[i - 1];
        }
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementDate.length;
        int newCapacity = oldCapacity * 2;
        elementDate = Arrays.copyOf(elementDate, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementDate[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementDate[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementDate[i] = elementDate[i + 1];
        }
    }

    public int indexOf(E o) {
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
