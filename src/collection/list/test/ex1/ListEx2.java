package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        List<Integer> arrayList = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            arrayList.add(number);

        }
        System.out.println("출력");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() -1 ) {
                System.out.print(arrayList.get(i));
            } else {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
    }
}
