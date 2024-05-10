package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add(1);
        list.add(2);
        list.add("문자3");
        Integer integer1 = (Integer) list.get(0);
        Integer integer2 = (Integer) list.get(1);
        Integer integer3 = (Integer) list.get(2);
    }
}
