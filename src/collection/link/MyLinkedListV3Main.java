package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(0, "d");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.add(1, "e");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
