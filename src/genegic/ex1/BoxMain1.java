package genegic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);// 오토박싱

        Integer integer = integerBox.get();

        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
