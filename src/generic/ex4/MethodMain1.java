package generic.ex4;

import generic.animal.Dog;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        Integer i1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("i1 = " + i1);

        Integer integer = GenericMethod.<Integer>NumberMethod(10);
        System.out.println("integer = " + integer);
    }
}
