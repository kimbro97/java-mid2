package generic.test.ex1;

public class Pair<K, T> {
    private K key;
    private T type;

    public void setFirst(K key) {
        this.key = key;
    }

    public void setSecond(T type) {
        this.type = type;
    }

    public K getFirst() {
        return this.key;
    }

    public T getSecond() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", type=" + type +
                '}';
    }
}
