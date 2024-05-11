package collection.list.test.ex2;

import java.util.List;

public class ShoppingCart {
    private final List<Item> list;

    public ShoppingCart(List<Item> list) {
        this.list = list;
    }

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (Item item : list) {
            total += item.getTotalPrice();
            System.out.println(item);
        }
        System.out.println("전체 가격 합: " + total);
    }
}
