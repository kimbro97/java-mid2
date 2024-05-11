package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        double avg = (double) total / numbers.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
